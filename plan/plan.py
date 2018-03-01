from coplen import Course, Goals, Month, Reference, Topic, generate

if __name__ == '__main__':
    course = Course(
            kind='minicurso',
            title='Minicurso de Java Moderno',
            hours={
                'theoretical': 10,
                'practice': 8,
                },
            start=Month.MARCH,
            end=Month.JUNE,
            year=2018,
            targets=[
                'Ciência da Computação',
                'Sistemas de Informação',
                'Interessados na linguagem Java',
                ],
            requires=[
                'Nenhum.',
                ],
            goals=Goals(
                general='Auxiliar na aprendizagem das disciplinas de'
                        ' Programação Orientada a Objetos 1 e 2, demonstrando,'
                        ' através da criação de um projeto de escolha dos'
                        ' alunos os recursos da linguagem, boas práticas,'
                        ' reusabilidade, \\textit{tradeoffs} entre soluções'
                        ' (performance, uso de memória, manutenção...) e as'
                        ' novidades nas versões mais recentes.',
                specific=[
                    'Apresentar os recursos básicos da linguagem Java,'
                    ' dentre eles:\n'
                    '\\begin{itemize}[label={-}]'
                    '    \\item Classes e método \\texttt{main};\n'
                    '    \\item Declaração/instanciação de variáveis;\n'
                    '    \\item Ciclo de vida de variáveis;\n'
                    '    \\item Referência e cópia;\n'
                    '    \\item Métodos e construtores.\n'
                    '\\end{itemize}'
                    'Além das características e funcionamento interno deles',

                    'Criar um projeto simples para mostrar o uso das '
                    ' estruturas básicas da programação imperativa '
                    ' (comparação, seleção, repetição, funções\\ldots)',

                    'Melhorar o desempenho e entendimento dos alunos das '
                    ' disciplinas de Programação Orientada a Objetos 1 e 2',

                    'Instruir os participantes a respeito das boas práticas de'
                    ' programação, a fim de que façam códigos bem '
                    ' estruturados, reutilizáveis e legíveis, aplicando '
                    ' conceitos de código-limpo e façam escolhas adequadas de '
                    ' padrões de projetos',

                    'Introduzir noções de algoritmos e resolução de problemas'
                    ' computacionalmente',

                    'Criar um projeto com enfoque no uso de diferentes recursos'
                    ' de programação orientada a objetos (interfaces, classes,'
                    ' tipos abstratos, \\ldots)',

                    'Expor formas de melhorar a manutenibilidade de software'
                    ' através de metodologias da programação moderna',

                    'Demonstrar o uso dos recursos recentes e progressão da'
                    ' linguagem Java',
                    ],
                ),
            topics=[
                Topic(
                    title='Introdução a Java',
                    duration=2,
                    items=[
                        'Características principais da linguagem',
                        '\\textit{Bytecode} e Processo de compilação',
                        'Introdução à JVM (\\textit{Java Virtual Machine})',
                        'Introdução ao paradigma imperativo',
                        'Tipos primitivos',
                        'Estruturas condicionais: \\texttt{if}',
                        'Inferência de tipo',
                    ],
                ),
                Topic(
                    title='Coleções',
                    duration=2,
                    items=[
                        'Laço de repetição \\textit{for}',
                        '\\textit{Raw-Arrays}',
                        'Tempo de vida de variáveis: Escopo',
                        '\\textit{Foreach}',
                    ],
                ),
                Topic(
                    title='Introdução a Algoritmos',
                    duration=2,
                    items=[
                        'Introdução a funções e procedimentos',
                        'Busca linear e binária',
                        'Complexidade de Algoritmos',
                        'Notação assintótica',
                        '\\textit{Bubble-Sort}',
                    ],
                ),
                Topic(
                    title='Tipos definidos por usuário',
                    duration=2,
                    items=[
                        'Classe, Objeto e Atributo',
                        'Alocação de memória na JVM',
                        '\\textit{Garbage-Collection}',
                        'Tempo de vida de objetos',
                    ],
                ),
                Topic(
                    title='Métodos',
                    duration=2,
                    items=[
                        'Cópia e Referência',
                        'Depuração de código',
                        'Encapsulamento de atributos',
                        'Boas práticas: API\\@',
                        'Documentação de código',
                    ],
                ),
                Topic(
                    title='Persistência',
                    duration=2,
                    items=[
                        'Processamento de texto',
                        'Introdução a segurança',
                        'Formato JSON',
                        'Operações em arquivos',
                    ],
                ),
                Topic(
                    title='Programação genérica e polimorfismo',
                    duration=2,
                    items=[
                        'Interfaces',
                        'Métodos \\textit{default}',
                        'Classes abstratas',
                        'Herança e problema do diamante',
                        '\\textit{Generics}',
                    ],
                ),
                Topic(
                    title='API funcional',
                    duration=2,
                    items=[
                        '\\textit{Callback}',
                        'Tipos de dados para funções',
                        'Funções \\textit{lambda}',
                    ],
                ),
                Topic(
                    title='Pacotes e bibliotecas',
                    duration=2,
                    items=[
                        'Sistema de pacotes Java',
                        '\\textit{Classpath}',
                        'Arquivo JAR\\@',
                        'Arquivo JAR executável',
                    ],
                ),
                Topic(
                    title='Introdução a Estruturas de Dados',
                    duration=2,
                    items=[
                        'Lista com vetor',
                        'Lista encadeada',
                        'Complexidade amortizada',
                        'Pilha',
                        'Padrão de projeto: Composição',
                    ],
                ),
                Topic(
                    title='(Extra) Otimização',
                    duration=2,
                    items=[
                        '\\textit{Tail-call recursion}',
                        '\\textit{Inline}',
                        '\\textit{JIT Compilation}',
                        'Otimizações da JVM\\@',
                    ],
                ),
            ],
            references=[
                Reference(
                    symbol='oracle-java-doc',
                    author='Oracle',
                    title='{Java Platform SE 10 Documentation}',
                    url='https://docs.oracle.com/javase/10/docs/api/index.html',
                    note='\\url{https://docs.oracle.com/javase/10/docs/api/index.html}',
                ),
                Reference(
                    symbol='Cormen:2001:IA:580470',
                    author='Cormen, Thomas H. and Stein, Clifford and Rivest, Ronald L. and Leiserson, Charles E.',
                    title='{Introduction to Algorithms}',
                    year=2001,
                    isbn='0070131511',
                    edition='2nd',
                    publisher='McGraw-Hill Higher Education',
                ),
                Reference(
                    symbol='Wazlawick:2012',
                    author='Raul Sidnei Wazlawick',
                    title='{Engenharia de Software para Sistemas de Informação: Conceitos e práticas que fazem sentido',
                    year=2012,
                ),
            ]
        )

    generate(course, output='plan.tex')
