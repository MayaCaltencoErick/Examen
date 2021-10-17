/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function cargarArchivo(elemento){
    
var file = elemento.files[0];
	var objHidden = document.formulario.nombre;
        document.formulario.target = "null";
        document.formulario.action = "Cifrado";
	objHidden.value = file.name;
        
}

function descifrar(elemento){

var file = elemento.files[0];
	var objHidden = document.formulario.nombre;
        document.formulario.target = "null";
        document.formulario.action = "descifrar";
	objHidden.value = file.name;
        
}

function validar(){
     var nombre = document.getElementById("hola");
     var llave = document.getElementById("hola2");
     var tamanio= document.getElementById("tamano");
    
     if(tamanio.value === "16"){
      if(llave.value.length !== 16){
         alert("ingrese una llave de 16 caracteres");
         return false;
     }else{
    var allowedExtensions = /(.txt)$/i;
        if(!allowedExtensions.exec(nombre.value)){
        alert('Por favor sólo suba archivos.txt.');
        return false;
    }else{
	
	alert("proceso terminado");
        return true;
    }    
    return true;
     }   
     }else{
         if(tamanio.value === "24"){
      if(llave.value.length !== 24){
         alert("ingrese una llave de 24 caracteres");
         return false;
     }else{
    var allowedExtensions = /(.txt)$/i;
        if(!allowedExtensions.exec(nombre.value)){
        alert('Por favor sólo suba archivos.txt.');
        return false;
    }else{
	
	alert("proceso terminado");
        return true;
    }    
    return true;
     }   
     }else{
         if(tamanio.value === "32"){
      if(llave.value.length !== 32){
         alert("ingrese una llave de 32 caracteres");
         return false;
     }else{
    var allowedExtensions = /(.txt)$/i;
        if(!allowedExtensions.exec(nombre.value)){
        alert('Por favor sólo suba archivos.txt.');
        return false;
    }else{
	
	alert("proceso terminado");
        return true;
    }    
    return true;
     }   
     }
       return true;
   }  
   return true;
     }
     
    
}
function validar2(){
     var nombre = document.getElementById("hola");
     var llave = document.getElementById("hola2");
     var tamanio= document.getElementById("tamano");
    
     if(tamanio.value === "16"){
      if(llave.value.length !== 16){
         alert("ingrese una llave de 16 caracteres");
         return false;
     }else{
    var allowedExtensions = /(.cifrado)$/i;
        if(!allowedExtensions.exec(nombre.value)){
        alert('Por favor sólo suba archivos.txt.');
        return false;
    }else{
	
	alert("proceso terminado");
        return true;
    }    
    return true;
     }   
     }else{
         if(tamanio.value === "24"){
      if(llave.value.length !== 24){
         alert("ingrese una llave de 24 caracteres");
         return false;
     }else{
    var allowedExtensions = /(.cifrado)$/i;
        if(!allowedExtensions.exec(nombre.value)){
        alert('Por favor sólo suba archivos.txt.');
        return false;
    }else{
	
	alert("proceso terminado");
        return true;
    }    
    return true;
     }   
     }else{
         if(tamanio.value === "32"){
      if(llave.value.length !== 32){
         alert("ingrese una llave de 32 caracteres");
         return false;
     }else{
    var allowedExtensions = /(.cifrado)$/i;
        if(!allowedExtensions.exec(nombre.value)){
        alert('Por favor sólo suba archivos.txt.');
        return false;
    }else{
	
	alert("proceso terminado");
        return true;
    }    
    return true;
     }   
     }
       return true;
   }  
   return true;
     }
     
}
