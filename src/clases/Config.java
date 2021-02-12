/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Autentag
 */
public class Config {
    private String ServerIP;
    private String Port;
    private String DataBase;
    private String Table;
    private String User;
    private String Passwd;

    public Config(){
      ServerIP="Nulo";
      Port = "Nulo";
      DataBase ="Nulo";
      Table ="Nulo";
      User ="Nulo";
      Passwd="Nulo";
    }
    public Config(String ServerIP, String Port, String DataBase, String Table, String User, String Passwd) {
        this.ServerIP = ServerIP;
        this.Port = Port;
        this.DataBase = DataBase;
        this.Table = Table;
        this.User = User;
        this.Passwd = Passwd;
    }
    /**
     * 
     * @return 
     */
    public String getDataBase() {
        return DataBase;
    }
    /**
     * 
     * @param DataBase 
     */
    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
    }
    /**
     * 
     * @return 
     */
    public String getPasswd() {
        return Passwd;
    }
  /**
     * 
     * @param Passwd 
     */
    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }
/**
     * 
     * @return 
     */
    public String getPort() {
        return Port;
    }
/**
     * 
     * @param Port 
     */
    public void setPort(String Port) {
        this.Port = Port;
    }
    /**
     * 
     */
    public String getServerIP() {
        return ServerIP;
    }
    /**
     * 
     * @param ServerIP 
     */
    public void setServerIP(String ServerIP) {
        this.ServerIP = ServerIP;
    }
/**
     * 
     * @return 
     */
    public String getTable() {
        return Table;
    }
/**
     * 
     * 
     */
    public void setTable(String Table) {
        this.Table = Table;
    }
    /**
     * 
     * @return  el nombre del usuario con el que se conecta
     */
    public String getUser() {
        return User;
    }
    /**
     * 
     * @param User  para ponerlo al objeto
     */
    public void setUser(String User) {
        this.User = User;
    }
    /**
     *   Guarda los datos del objeto en un archivo de manera encriptada
     */
    public void guardar()
    {
          try
        {
        String PathArchivo = new File(".").getCanonicalPath();
        String ruta = PathArchivo +"/Config.conf";
        // cambiar \\ por / en linux
        File miarchivo = new File(ruta);
        if(!miarchivo.exists()){
            FileWriter fw = new FileWriter(miarchivo);
        }
        Encriptar enc = new Encriptar();
        enc.setIntXor(25);
        //if(miarchivo.exists())
        //{   
        //System.out.println(ruta);
         String cad="";
        
           FileWriter fw = new FileWriter(miarchivo);
           BufferedWriter bw = new BufferedWriter(fw);
           cad ="ServerIP:"+ServerIP;
           bw.write(enc.EncryptaX(cad));
           bw.newLine();
           cad ="Port:"+Port;
           bw.write(enc.EncryptaX(cad));
           bw.newLine();
           cad= "DataBase:"+DataBase;
           bw.write(enc.EncryptaX(cad));
           bw.newLine();
           cad = "Table:"+Table;
           bw.write(enc.EncryptaX(cad));
           bw.newLine();
           cad = "User:"+User;
           bw.write(enc.EncryptaX(cad));
           bw.newLine();
           cad="Password:"+Passwd;
           bw.write(enc.EncryptaX(cad));
           bw.newLine();
           bw.close();
           fw.close();
        //}
        //else
        //{
        
        //}
       
       
        }catch(IOException ioe)
        { 
              try {
                String PathArchivo = new File(".").getCanonicalPath();
                String ruta = PathArchivo + "/Error.log";
                File miarchivo = new File(ruta);
        //if(miarchivo.exists())
                //{   
                FileWriter fw = new FileWriter(miarchivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Error: " + ioe.getMessage());

                bw.close();
                fw.close();
        //}
                //else
                //{

        //}
            } catch (IOException ioe2) {
                // nada
            }
     }
    }
    /**
     * 
     * @return ningun dato pero carga el objeto con los datos
     * leidos  del archivo config.conf
     */
    public boolean cargar(){
       boolean resultado=false;
        try
        {
        String PathArchivo = new File(".").getCanonicalPath();
        String ruta = PathArchivo +"/Config.conf";
        // poner \\ para windows y / para linux
        File miarchivo = new File(ruta);
        
        if(miarchivo.exists()) {   
           FileReader fr = new FileReader(miarchivo);
           BufferedReader br = new BufferedReader(fr);
           String leer = br.readLine();
           //System.out.println("antes: "+leer);
           Encriptar enc = new Encriptar();
           String leido= enc.EncryptaX(leer);
           // System.out.println("Despues: "+leido);
           String[] misDatos= null;
           
           while(leer!= null )  {
                  leido= enc.EncryptaX(leer);
                  misDatos = leido.split(":");              
             
                  if(misDatos[0].equals("ServerIP")) 
                      setServerIP(misDatos[1]);
                  
                  if(misDatos[0].equals("Port"))
                      setPort(misDatos[1]);    
                  
                  if(misDatos[0].equals("DataBase"))
                      setDataBase(misDatos[1]);
                                        
                  if(misDatos[0].equals("Table"))
                      setTable(misDatos[1]);
                   
                  if(misDatos[0].equals("User"))                     
                      setUser(misDatos[1]);
                  
                  if(misDatos[0].equals("Password"))
                      setPasswd(misDatos[1]);
                     
                  
                  leer = br.readLine();   
                  
              } //end while
              resultado= true;
              br.close();
              fr.close();
           } //end if
          else   {
            resultado = false;
            ServerIP="Nulo";
            Port = "Nulo";
            DataBase ="Nulo";
            Table ="Nulo";
            User ="Nulo";
            Passwd="Nulo";
        }
        
        } // fon del try
          catch(IOException ioe) {
          }

        
        return resultado;
    }
    /**
     * 
     * @param cadena
     * @return  cadena encriptada
     */
//    public String EncryptaX(String cadena) {
//        int IntXor=3;
//        char[] caracter = cadena.toCharArray();
//        //System.out.println("Recibida X: "+cadena);
//        String cadenaNueva = "";
//        char nuevo;
//        for (int a = 0; a < caracter.length; a++) {
//            nuevo = (char) ((char) caracter[a] ^ IntXor);
//            cadenaNueva +=  nuevo;
//        }
//         //System.out.println(cadenaNueva);
//        return cadenaNueva;
//    }
    /**
     * 
     * @param cad
     * @return  una cadena de TAntos asteriscos como caracteres teng ala cadena 
     */
    
    public String genCad(String cad){
     String creada="";
     
     for(int j=1;j<=cad.length();j++)
         creada+="*";
     return creada;
    }
    
    /**
     * 
     *Crea una cadena con los datos de la configuracion
     */
    public String mostrar()
    {
       return getServerIP()+":" + getPort()+";"+getDataBase()+";"+getTable()+";"+getUser()+";"+genCad(getPasswd());
    }
    
}
