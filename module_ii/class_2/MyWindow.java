import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyWindow extends JFrame {
    public static final long serialVersionUID = 1L;

    JLabel lblName;
    JLabel lblCost;
    JTextField edtName;
    JTextField edtCost;
    JButton btnSave;

    public MyWindow() {
        super();

        lblName = new JLabel("Nome:");
        lblName.setSize(64, 24);
        lblName.setLocation(4, 4);

        lblCost = new JLabel("Preço:");
        lblCost.setSize(64, 24);
        lblCost.setLocation(4, 32);

        edtName = new JTextField();
        edtName.setSize(64, 24);
        edtName.setLocation(68, 4);

        edtCost = new JTextField();
        edtCost.setSize(64, 24);
        edtCost.setLocation(68, 32);

        btnSave = new JButton("Salvar");
        btnSave.setSize(128, 24);
        btnSave.setLocation(4, 60);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveProduct();
            }
        });

        setTitle("Cadastro de Produto");
        setLayout(null);
        getContentPane().add(lblName);
        getContentPane().add(lblCost);
        getContentPane().add(edtName);
        getContentPane().add(edtCost);
        getContentPane().add(btnSave);
        setSize(320, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Product product = null;
        try {
            FileInputStream fis = new FileInputStream("product");
            ObjectInputStream ois = new ObjectInputStream(fis);
            product = (Product)ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }

        if (product != null) {
            edtName.setText(product.getName());
            edtCost.setText(""+product.getCost());
        }
    }

    private void saveProduct() {
        Product product = new Product(
                                edtName.getText(),
                                Double.parseDouble(edtCost.getText())
                            );
        try {
            FileOutputStream fos = new FileOutputStream("product");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro ao salvar produto");
        }
    }

}
