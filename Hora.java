/**
 *
 * @author Gustavo
 */
public class Hora 
{
    private int hora;
    private int min;
    private int seg;

    public void setHora(int a, int b, int c) 
    {
        this.hora = a;
        this.min = b;
        this.seg = c;
    }

    public String getHora() 
    {
        String hr = (this.hora + ":" + this.min + ":" + this.seg);
        return hr;
    }
}
