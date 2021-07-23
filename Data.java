/**
 *
 * @author Gustavo
 */
public class Data 
{
    private int dia;
    private int mes;
    private int ano;

    public String getData() 
    {
        String dt = (dia + "/" + mes + "/" + ano);
        return dt;
    } 
    public void setData(int a, int b, int c)
    {
        this.dia = a;
        this.mes = b;
        this.ano = c;
    }
    
}