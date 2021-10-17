/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.crypto.*;
import javax.crypto.spec.*;
//generar las llaves

import java.security.*;
//todos los tipos de algoritmo de cifrado :3

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author PRIDE OTTER
 */
//obligatorio usar multipartconfig para trabajar con la recepción de archivos
@MultipartConfig
public class Cifrado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nomb = request.getParameter("nombre");
            Part arch = request.getPart("archivo");
            InputStream is = arch.getInputStream(); 
                File f = new File("C:/Pruebas/"+nomb+".cifrado");
                FileOutputStream ous = new FileOutputStream(f);
                    
                
            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcesoArchivo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcesoArchivo at " + request.getContextPath() + "</h1>");
            out.println("Hola");
            out.println("</body>");
            out.println("</html>");
            
            System.out.println("1.- Generar clave AES: ");
           
        //obtenemos llave de los campos en el html            
        String clave=request.getParameter("llave");
        System.out.println("hola"+clave);
                    
       //Generamos la llave que se va a usar a partir de los bytes del parámetro anterior y una instancia             
       SecretKeySpec kspec = new SecretKeySpec(clave.getBytes(), "AES");
                    
                    
        //inicializamos el cifrado con la llave generada y la instancia "AES"     
        Cipher cifrado = Cipher.getInstance("AES");
        cifrado.init(Cipher.ENCRYPT_MODE, kspec);
        
       
        
        byte[] buffer = new byte[1000];  //vamos a leer cada mil
        byte[] bufferCifrado;
        
        int bytesleidos = is.read(buffer, 0, 1000);
        //mientras no este al final del fichero o del archivo
        while(bytesleidos != -1){
            //pasar al texto claro ledio al cifrador
            bufferCifrado = cifrado.update(buffer, 0, bytesleidos);
            //generar la salida
            ous.write(bufferCifrado);
            bytesleidos = is.read(buffer, 0, 1000);
        }
        //vamos a reunir los bloques del cifrado
        bufferCifrado = cifrado.doFinal();
        //ya puedo escribir el archivo cifrado
        ous.write(bufferCifrado);
        
        is.close();
        ous.close();
            response.sendRedirect("index.jsp");  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Cifrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
