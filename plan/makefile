#-------------------------------------------------------------------------------
# Generators
LATEX         := xelatex

# Input files
COURSE-JSON   := plan.json
COURSE-BIBREF := references.bib

# Generated files
COURSE-TEX    := plan.tex
COURSE-PDF    := plan.pdf

#-------------------------------------------------------------------------------
.PHONY: all tex obj-pdf clean

all: $(COURSE-PDF)


$(COURSE-TEX): $(COURSE-JSON)
	python -m coplen --output plan.tex plan.json


$(COURSE-PDF): $(COURSE-TEX) $(COURSE-BIBREF)
	@$(eval SOURCES := $^)
	@mkdir -p obj
	cp $(SOURCES) obj/
	@[ -f $@ ] && cp $@ obj/$@ || echo "No pdf"
	cd obj
	make -C obj -f ../makefile obj-pdf --no-print-directory
	cp -f obj/$(COURSE-PDF) .


obj-pdf:
	$(eval OBJNAME := $(basename $(COURSE-PDF)))
	$(LATEX) $(OBJNAME)
	bibtex   $(OBJNAME)
	$(LATEX) $(OBJNAME)
	$(LATEX) $(OBJNAME)

.PHONY: clean

clean:
	rm -rf obj/
	rm $(COURSE-TEX)

clean-pdf:
	rm $(COURSE-PDF)
