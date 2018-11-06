
package reservadevuelosvista;

import SistemaDeReserva.Cliente;
import SistemaDeReserva.ClienteData;
import SistemaDeReserva.Conexion;
import SistemaDeReserva.Limpiar;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaCliente extends javax.swing.JInternalFrame {
    private ArrayList<Cliente> listacliente;
    private ClienteData clienteData;
    private Cliente cliente;
    private Conexion conexion;
    /**
     * Creates new form VistaCliente
     */
    public VistaCliente() {
        try {
            initComponents();
            conexion=new Conexion("jdbc:mysql://localhost/reservadevuelos","root","");
            clienteData=new ClienteData(conexion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNroPasaporte = new javax.swing.JTextField();
        txtNroTarjeta = new javax.swing.JTextField();
        jtNombre = new javax.swing.JLabel();
        jtDni = new javax.swing.JLabel();
        jtEmail = new javax.swing.JLabel();
        jtNroPasaporte = new javax.swing.JLabel();
        jtNroTarjeta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();

        setClosable(true);

        panelCliente.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CLIENTE");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jtNombre.setText("Nombre y Apellido");

        jtDni.setText("DNI");

        jtEmail.setText("Email");

        jtNroPasaporte.setText("Nro de pasaporte");

        jtNroTarjeta.setText("Nro de tarjeta");

        jLabel2.setText("Direccion");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        idCliente.setEditable(false);

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(42, 42, 42)
                                .addComponent(btnBuscar)
                                .addGap(56, 56, 56)
                                .addComponent(btnLimpiar))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel1)))
                        .addGap(43, 43, 43)
                        .addComponent(btnBorrar))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtEmail)
                                    .addComponent(jtNroTarjeta)
                                    .addComponent(jtDni)
                                    .addComponent(jtNroPasaporte))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccion)
                                        .addComponent(txtNroPasaporte)
                                        .addComponent(txtDni)
                                        .addComponent(txtNroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                                        .addComponent(jtNombre)
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(107, 107, 107)))
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDni))
                .addGap(20, 20, 20)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEmail))
                .addGap(20, 20, 20)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNroPasaporte))
                .addGap(20, 20, 20)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNroTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnBorrar))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreYApellido = txtNombre.getText();
        String email = txtEmail.getText();
        String dom=txtDireccion.getText();
        int dni=Integer.parseInt(txtDni.getText());
        int pass=Integer.parseInt(txtNroPasaporte.getText());
        int tarjeta=Integer.parseInt(txtNroTarjeta.getText());
        Cliente cliente = new Cliente(nombreYApellido, dni,dom, email,pass,tarjeta);
        if(cliente!=null){
            int n=(clienteData.guardarCliente(cliente));
            idCliente.setText(n+"");
            JOptionPane.showMessageDialog(null, "El Cliente se Guardo Corectamente!!!");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    //**boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id=JOptionPane.showInputDialog("Ingrese ID del Cliente");
        if (!(id.equalsIgnoreCase(null))){
            int idcliente=Integer.parseInt(id);
            Cliente cl=clienteData.buscarCliente(idcliente);
            if (!(cl==null)){
                txtNombre.setText(cl.getNombreYApellido());
                txtDni.setText(cl.getDni()+"");
                txtDireccion.setText(cl.getDomicilio());
                txtEmail.setText(cl.getEmail());
                txtNroPasaporte.setText(cl.getNroDePasaporte()+"");
                txtNroTarjeta.setText(cl.getNroDeTarjeta()+"");
                idCliente.setText(cl.getId()+"");
            }
            else{
                JOptionPane.showMessageDialog(null, "El Cliente no Existe!");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //**boton limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar limpia=new Limpiar();
        limpia.limpiarFormulario(panelCliente);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //**boton borrar
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(!(idCliente.getText().equalsIgnoreCase(""))){
                int confirma=JOptionPane.showConfirmDialog(null, "Esta seguro de Borrar al Cliente", "Confirmar", JOptionPane.YES_NO_OPTION);
            if(confirma==0){
                clienteData.borrarCliente(Integer.parseInt(idCliente.getText()));
                Limpiar limpia=new Limpiar();
                limpia.limpiarFormulario(panelCliente);
                JOptionPane.showMessageDialog(null, "EL Cliente se Borro Correctamente");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe tener un cliente para Borrar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jtDni;
    private javax.swing.JLabel jtEmail;
    private javax.swing.JLabel jtNombre;
    private javax.swing.JLabel jtNroPasaporte;
    private javax.swing.JLabel jtNroTarjeta;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroPasaporte;
    private javax.swing.JTextField txtNroTarjeta;
    // End of variables declaration//GEN-END:variables
}
