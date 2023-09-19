package universidadlapuntagrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadlapuntagrupo64.Entidades.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //ps.setInt(1, materia.getidMateria());
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

}
