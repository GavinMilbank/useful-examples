
public class Automovel
{
    private String combustivel;
    private String fabricante;
    private int ano;
    private String modelo;

    public Automovel(String combustivel, String fabricante, int ano, String modelo)
    {
        this.combustivel = combustivel;
        this.fabricante = fabricante;
        this.ano = ano;
        this.modelo = modelo;
    }

    public float combNecessario(float km)
    {
        if (combustivel.equals("gasolina"))
        {
            return km / 12;
        }
        else if (combustivel.equals("alcool"))
        {
            return km / 15;
        }
        else if (combustivel.equals("flex"))
        {
             return km/30 + km/24;
        }  
        else 
            return 0; // HERE, I don't know what should I return in this case
    }
}
