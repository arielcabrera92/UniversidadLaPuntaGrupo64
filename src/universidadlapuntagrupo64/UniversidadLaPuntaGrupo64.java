
package universidadlapuntagrupo64;

import java.sql.Connection;

import java.time.LocalDate;
import universidadlapuntagrupo64.AccesoADatos.AlumnoData;
import universidadlapuntagrupo64.Entidades.Alumno;

import universidadlapuntagrupo64.AccesoADatos.Conexion;
import universidadlapuntagrupo64.AccesoADatos.MateriaData;
import universidadlapuntagrupo64.Entidades.Materia;
public class UniversidadLaPuntaGrupo64 {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        /*Alumno juan=new Alumno(12312311,"Luna","Pedro",LocalDate.of(1980, 4, 25),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(juan);
        */
        
        //Alumno martin =new Alumno(34569874,"Funes","pedro",LocalDate.of(1980, 4, 25),true);
        //AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(martin);
        //alu.modificarAlumno(martin);
        
        //Alumno martin =new Alumno(25698789,"Gonzalez","Florencia",LocalDate.of(1978, 5, 19),true);
        //AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(martin);
        /*Alumno martin =new Alumno(25698789,"Gonzalez","Florencia",LocalDate.of(1978, 5, 19),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(martin);*/
        //guaradar materia
        Materia fisica = new Materia("fisica4",2, true);
        MateriaData mate = new MateriaData();
        mate.guardarMateria(fisica);
    }
    
}
