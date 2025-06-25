import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtCodigo;
    private JComboBox cboMarca;
    private JComboBox cboProcesador;
    private JComboBox cboRAM;
    private JButton btnRegistrar;
    private JTextArea txtListarComputador;
    private Arbol arbol=new Arbol();

    public Ventana() {
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo=Integer.parseInt(txtCodigo.getText());
                String marca=cboMarca.getSelectedItem().toString();
                String procesador=cboProcesador.getSelectedItem().toString();
                int ram=Integer.parseInt(cboRAM.getSelectedItem().toString());
                arbol.insertar(new Computador(codigo,
                        marca,procesador,ram));
                txtListarComputador.setText(arbol.inOrden());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
