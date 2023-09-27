package universidadlapuntagrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadlapuntagrupo64.Entidades.Materia;
import java.util.ArrayList;
import java.util.List;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //ps.setInt(1, materia.getIdMateria());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                System.out.println("dentro del if");
                materia.setidMateria(rs.getInt(1));
                System.out.println(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La materia fue añadido con exito.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
            System.out.println(ex.getMessage());

        }

    }
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria=? AND estado=1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setidMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 
        }
        return materia;
    }
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ? , anio = ?, estado = ?,idMateria = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(5, materia.getidMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
        }
    }
    public void eliminarMateria (int id) {

        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();

            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }
    }
    public List<Materia> listarMaterias() {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();

                materia.setidMateria(rs.getInt("idMateria")); //alumno.setIdAlumno(rs.getInt("idAlumno"));
                materia.setNombre(rs.getString("nombre")); //alumno.setDni(rs.getInt("dni"));
                materia.setAnio(rs.getInt("anio")); //alumno.setApellido(rs.getString("apellido"));
                materia.setEstado(rs.getBoolean("estado")); //alumno.setEstado(rs.getBoolean("estado"));
                materias.add(materia); // alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia "+ex.getMessage());
        }
        return materias;
    }
}

