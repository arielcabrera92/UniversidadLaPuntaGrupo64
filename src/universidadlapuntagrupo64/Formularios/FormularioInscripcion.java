/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadlapuntagrupo64.Formularios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadlapuntagrupo64.AccesoADatos.AlumnoData;
import universidadlapuntagrupo64.AccesoADatos.InscripcionData;
import universidadlapuntagrupo64.AccesoADatos.MateriaData;
import universidadlapuntagrupo64.Entidades.Alumno;
import universidadlapuntagrupo64.Entidades.Inscripcion;
import universidadlapuntagrupo64.Entidades.Materia;

public class FormularioInscripcion extends javax.swing.JInternalFrame {
    
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    public FormularioInscripcion() {
        initComponents();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData ();
        mData = new MateriaData();
        
        cargarAlumnos();
        armarCabeceraTabla();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbinscribir = new javax.swing.JButton();
        jbainscripcion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(56, 133, 188));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Incripcion");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jComboBox1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        radioInscriptas.setBackground(new java.awt.Color(56, 133, 188));
        radioInscriptas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setBackground(new java.awt.Color(56, 133, 188));
        radioNoInscriptas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        radioNoInscriptas.setText("Materias No Inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbinscribir.setBackground(new java.awt.Color(23, 56, 79));
        jbinscribir.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jbinscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbinscribir.setText("Inscribir");
        jbinscribir.setEnabled(false);
        jbinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinscribirActionPerformed(evt);
            }
        });

        jbainscripcion.setBackground(new java.awt.Color(23, 56, 79));
        jbainscripcion.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jbainscripcion.setForeground(new java.awt.Color(255, 255, 255));
        jbainscripcion.setText("Anular Inscripcion");
        jbainscripcion.setEnabled(false);
        jbainscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbainscripcionActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(23, 56, 79));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(radioInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioNoInscriptas)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbinscribir)
                .addGap(18, 18, 18)
                .addComponent(jbainscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbinscribir)
                    .addComponent(jbainscripcion)
                    .addComponent(jButton3))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
borrarFilaTabla();
radioNoInscriptas.setSelected(false);
cargarDatosInscriptas();
jbinscribir.setEnabled(true);
jbinscribir.setEnabled(false);




    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        borrarFilaTabla();
        radioInscriptas.setSelected(false);
        cargarDatosNoInscriptas();
        jbainscripcion.setEnabled(false);
        jbinscribir.setEnabled(true);
        
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void jbinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinscribirActionPerformed
   int filaSeleccionada = jTable1.getSelectedRow();
   if (filaSeleccionada!=-1){
        
       Alumno a=(Alumno)jComboBox1.getSelectedItem();
       
       int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
       String nombreMateria=(String)modelo.getValueAt (filaSeleccionada,1);
       int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
       Materia m=new Materia(idMateria,nombreMateria,anio,true);
       
       Inscripcion i=new Inscripcion(a,m,0);
       inscData.guardarInscripcion(i);
       borrarFilaTabla();
       
       
    }
   
        
    }//GEN-LAST:event_jbinscribirActionPerformed

    private void jbainscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbainscripcionActionPerformed
    /*
        int filaSeleccionada=jTable1.getSelectedRow();
        if (filaSeleccionada!=-1){
            
            Alumno a=(Alumno)jComboBox1.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
      */
    int filaSeleccionada=jTable1.getSelectedRow();
        if (filaSeleccionada!=-1){
            
            Alumno a=(Alumno)jComboBox1.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbainscripcionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbainscripcion;
    private javax.swing.JButton jbinscribir;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() {
        for (Alumno item:listaA){
            jComboBox1.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
        
        
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount()-1;
        
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void cargarDatosNoInscriptas(){
        Alumno selec = (Alumno)jComboBox1.getSelectedItem();
        listaM = (ArrayList) inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for (Materia m: listaM){
            modelo.addRow(new Object[]{m.getidMateria(),m.getNombre(),m.getAnio()});
            
        }
    }
    private void cargarDatosInscriptas(){
        Alumno selec = (Alumno)jComboBox1.getSelectedItem();
        ArrayList <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m: lista){
            modelo.addRow(new Object[]{m.getidMateria(),m.getNombre(),m.getAnio()});
        }
    }
}
