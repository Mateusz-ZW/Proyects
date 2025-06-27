/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideojuegos;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class Telefono implements Serializable{
     private String pref= "+34";
    private String num="000 000 000";
    
    public Telefono()
    {        
    }
    
    public Telefono(String n) throws TelefonoException
    {
        setNum(n);
    }
    
    public Telefono(String p, String n) throws TelefonoException
    {
        if (!esPrefijoValido(p))
            throw new TelefonoException("No se ha podido crear el teléfono. Prefijo inválido.");
        if (!esNumeroValido(n))
            throw new TelefonoException("No se ha podido crear el teléfono. Número inválido.");
        pref = p;
        String aux = n.replaceAll(" ", "");
        num = aux.substring(0, 3)+" "+aux.substring(3, 6)+" "+aux.substring(6);
    }
    
    
    private boolean esPrefijoValido(String p)
    {
        try
        {
            if (p.length()==3)
            {
                if (p.charAt(0) == '+' )
                {
                    Integer.parseInt(p.substring(1));
                    return true;
                }
                else
                {
                    return false;
                }
            }        
            else if (p.length()==4)
            {
                if (Integer.parseInt(p.substring(0, 2)) == 0)
                {
                    Integer.parseInt(p.substring(2));
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    private boolean esNumeroValido(String n)
    {
        String aux = n.replaceAll(" ", "");
        try
        {
            if (aux.length()==9)
            {
                Integer.parseInt(aux);
                return true;
            }
            else
                return false;
        }
        catch (Exception e)
        {
            return false;
        }                           
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String p) throws TelefonoException{
        if (!esPrefijoValido(p))
            throw new TelefonoException("No se ha podido crear el teléfono. Prefijo inválido.");
        pref = p;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String n) throws TelefonoException{
        if (!esNumeroValido(n))
            throw new TelefonoException("No se ha podido crear el teléfono. Número inválido.");
        String aux = n.replaceAll(" ", "");
        num = aux.substring(0, 3)+" "+aux.substring(3, 6)+" "+aux.substring(6);
    }
    
    @Override
    public String toString()
    {
        return pref+" "+num;
    }
}
