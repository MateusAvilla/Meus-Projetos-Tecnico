package calcular_imc;


public class Pessoa 
{
    private String nome;
    private int idade;
    private float peso, altura, imc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
    public void calcularPesoIdeal()       
    {
        imc = peso / (altura * altura);
    }
    
    public String situacao()
    {
        String situacao = "";
        if (imc <= 18.4)
            {
                situacao = "Abaixo do peso";
            }
        
        else if (imc >= 18.5 && imc <=24.9)
        {
            situacao = "Peso Normal";
        }
        
        else if (imc >= 25.0 && imc <= 29.9)
        {
            situacao = "Sobrepeso";
        }
        
        else if (imc >= 30.0 && imc <= 34.9)
        {
            situacao = "Obesidade Grau 1, faz uma dieta cara!";
        }
        
        else if (imc >= 35.0 && imc <= 39.9)
        {
            situacao = "Obesidade Grau 2, procura um médico e vai pra academia, cuidado hein.";
        }
        
        else if (imc >=40)
        {
            situacao = "Obesidade Grau 3, vish, você precisa de ajuda urgente";
        }
        
        
        return situacao;
    }        
    
    
    
    
    
}
