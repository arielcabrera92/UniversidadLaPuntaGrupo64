/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadlapuntagrupo64.Formularios;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadlapuntagrupo64.Entidades.Alumno;
import universidadlapuntagrupo64.AccesoADatos.AlumnoData;
import universidadlapuntagrupo64.AccesoADatos.Conexion;
import universidadlapuntagrupo64.AccesoADatos.InscripcionData;
import universidadlapuntagrupo64.AccesoADatos.MateriaData;
import universidadlapuntagrupo64.Entidades.Inscripcion;
import universidadlapuntagrupo64.Entidades.Materia;

/**
 *
 * @author ariel
 */
public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA; 
    private InscripcionData inscData; 
    private MateriaData mData; 
    private AlumnoData aData; 
    
    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form NuevaActualizacionDeNotas
     */
    public ActualizacionDeNotas() {
        initComponents();
        aData = new AlumnoData(); 
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData(); 
        mData = new MateriaData(); 
        cargarAlumno();
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
        jlTitulo = new javax.swing.JLabel();
        jlSeleccionarAlumno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMaterias = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(56, 133, 188));

        jlTitulo.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jlTitulo.setText("Actualización de notas");

        jlSeleccionarAlumno.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jlSeleccionarAlumno.setText("Seleccionar Alumno");

        jtListaMaterias.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jtListaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListaMaterias);

        jbGuardar.setBackground(new java.awt.Color(23, 56, 79));
        jbGuardar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(23, 56, 79));
        jbSalir.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbListaAlumnos.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlSeleccionarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSeleccionarAlumno)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtListaMaterias.getSelectedRow(); 
        if (filaSeleccionada != -1){
            Alumno a = (Alumno)jcbListaAlumnos.getSelectedItem();
            int idAlumno = a.getIdAlumno();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            double nota = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 2).toString());
            inscData.actualizarNota(idAlumno, idMateria, nota);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
        cargarDatosInscriptas();
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JLabel jlSeleccionarAlumno;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtListaMaterias;
    // End of variables declaration//GEN-END:variables
    private void cargarAlumno(){
        Alumno alumno = new Alumno(); 
        for (Alumno item: listaA) {
            jcbListaAlumnos.addItem(item);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList <Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID Materia");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtListaMaterias.setModel(modelo);
    }
    
    private void cargarDatosInscriptas(){
        //borrarFilasTabla();
        Alumno selec = (Alumno)jcbListaAlumnos.getSelectedItem();
        List<Inscripcion> lista = (ArrayList) inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        for(Inscripcion i: lista){
            modelo.addRow(new Object[] {i.getMateria().getidMateria(), i.getMateria().getNombre(), i.getNota()});
        }
    }
    private void borrarFilasTabla(){
        int indice = modelo.getRowCount() -1;
        for (int i = indice; i>=0; i--){
            modelo.removeRow(i);
        }
    }
}