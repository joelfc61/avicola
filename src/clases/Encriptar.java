package clases;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author PERSONAL
 */
public class Encriptar {

    /**
     * Convierte arreglos de bytes en cadenahexadecimal
     *
     * @param buf Este es arreglo a convertir
     * @return	Cadena Askii generada
     */
    private String ordenada;
    private String desordenada;
    int IntXor;
    int OffSet;

    public Encriptar() {
        ordenada = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ordenada += "abcdefghijklmnopqrstuvwxyz1234567890$# .&,%_";
        desordenada = "B4IA3.NP5G1HW7UOCTKVFQ,X6S9LJY8DRZ20ME";
        desordenada += "p#ard$qcnikoht_xe&sjmgwy buv%zlf";
        IntXor = 25;
        OffSet=5;
    }

    public void setIntXor(int IntXor) {
        this.IntXor = IntXor;
    }

    /**
     *
     * @param buf
     * @return
     */
    private String asHex(byte buf[]) {
        StringBuffer strbuf = new StringBuffer(buf.length * 2);
        int i;

        for (i = 0; i < buf.length; i++) {
            if (((int) buf[i] & 0xff) < 0x10) {
                strbuf.append("0");
            }

            strbuf.append(Long.toString((int) buf[i] & 0xff, 16));
        }

        return strbuf.toString();
    }

    public String combined_E(String cadena){
        String cad="";
        cad=this.Encrypt_Askii(cadena,OffSet);
        return this.EncryptaX(cad);
    }
    public String combined_D(String cadena){
        String cad="";
        cad=this.EncryptaX(cadena);
        return this.Desencrypt_Askii(cad,OffSet);
    }
    /**
     *
     * @param cad CAdena a Encryptar con algoritmo de secuencia de MiguelAngel
     * @return Cadena encriptada
     */
    public String AlgoJulioCesar_E(String cad) {

        int pos;
        String cadena = "";
        for (int h = 0; h < cad.length(); h++) {
            pos = ordenada.indexOf(cad.charAt(h));
            cadena += desordenada.charAt(pos);
        }
        return cadena;
    }

    /**
     *
     * @param cad Cadema a Desencriptar, asume encriptada con algoritmo de
     * MiguelAngel
     * @return La cadena Original
     */
    public String AlgoJulioCesar_D(String cad) {

        int pos;
        String cadena = "";

        for (int h = 0; h < cad.length(); h++) {
            pos = desordenada.indexOf(cad.charAt(h));
            cadena += ordenada.charAt(pos);
        }
        return cadena;
    }

    /**
     *
     * @param cadenaOriginal texto a Encriptar
     * @param offset corrimiento agregado
     * @return cadena encriptada
     */
    public String Encrypt_Askii(String cadenaOriginal, int offset) {

        String cadenaNueva = "";
        int numero = 0;
        /*separa la cadena  de uno en uno por ejemplo UNIVA= [U] [N] [I] [V] [A] se convierten en char*/
        char[] Datos = cadenaOriginal.toCharArray();

        for (int a = 0; a < Datos.length; a++) {

            /* aqui cada letra la convierte en su codigo askii */
            numero = (int) Datos[a];
            /* al numero en askii le aumenta 10 posiciones hacia arriba del valor de la letra en askii */
            numero = numero + offset;
            /* convierte el codigo askii en letra correspondiente encryptado y se va sumando  a una variable */
            cadenaNueva = cadenaNueva + (char) numero;

        }
        return cadenaNueva;
    }

    /**
     *
     * @param cadenaEncriptada es la cadena original
     * @param offset corrimiento que se le quita
     * @return la cadena original
     */
    public String Desencrypt_Askii(String cadenaEncriptada, int offset) {

        String cadenaOriginal = "";
        int numero = 0;

        /* separa la cadena encriptada de letra por letra encriptada*/
        char[] Datos = cadenaEncriptada.toCharArray();

        for (int a = 0; a < Datos.length; a++) {
            /* se convierte en dato[a] la variable char correspondiente al codigo askii*/
            numero = (int) Datos[a];

            /* el  numero esquivalente al codigo askii se le restan 10 posiciones menos referentes al codigo askii*/
            numero = numero - offset;

            /* el numero en codigo askii se convierte al codigo normal char que era antes y se le suma a una variable de letra por letra*/
            cadenaOriginal = cadenaOriginal + (char) numero;

        }
        return cadenaOriginal;
    }

    /**
     *
     * @param cadena, cadena que se desea Encriptar
     * @return Cadena encriptada
     */
    public String EncryptaX(String cadena) {
        char[] caracter = cadena.toCharArray();
        String cadenaNueva = "";
        char nuevo;
        for (int a = 0; a < caracter.length; a++) {
            nuevo = (char) ((char) caracter[a] ^ IntXor);
            cadenaNueva = cadenaNueva + nuevo;
        }
        return cadenaNueva;
    }

    /**
     *
     * @param data Bytes que se desean convertir a Hexadecimal
     * @return cadena de caracteres
     */
    private String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }
    
}
