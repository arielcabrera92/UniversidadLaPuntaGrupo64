
package universidadlapuntagrupo64;

import java.sql.Connection;
import java.time.LocalDate;
import universidadlapuntagrupo64.AccesoADatos.*;
import universidadlapuntagrupo64.Entidades.*;
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
       /* Materia fisica = new Materia("fisica4",2, true);
        MateriaData mate = new MateriaData();
        mate.guardarMateria(fisica);*/
        //Alumno martin =new Alumno(25698789,"Gonzalez","Florencia",LocalDate.of(1978, 5, 19),true);
        //AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(martin);
        /*Alumno ricardo =new Alumno(28569753,"Arjona","Ricardo",LocalDate.of(1969, 12, 5),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(ricardo);
        */
        
        // Prueba inscripción 
        AlumnoData ad = new AlumnoData(); 
        MateriaData md = new MateriaData(); 
        InscripcionData id = new InscripcionData(); 
        Alumno ricardo = ad.buscarAlumno(9);
        Materia mate = md.buscarMateria(1);
        Inscripcion insc = new Inscripcion(ricardo, mate, 9); 
        //id.GuardarInscripcion(insc);
        //id.actualizarNota(9, 1, 7);
        //id.borrarInscripcionMateriaAlumno(9, 1);
        /*for(Inscripcion inscripcion:id.obtenerInscripciones()){
            System.out.println("Número de Inscipción " + inscripcion.getIdInscripcion());
            System.out.println("Apellido " + inscripcion.getAlumno().getApellido());
            System.out.println("Nombre " + inscripcion.getAlumno().getNombre());
            System.out.println("Materia " + inscripcion.getMateria().getNombre());
            
            
            
        }
        */
        for (Materia materia:id.obtenerMateriasCursadas(9)){
            System.out.println("Materia " + materia.getNombre());
        }

    }
    
}
