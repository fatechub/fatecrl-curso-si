package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import model.Telefone;

/**
 *
 * @author Ciro Cirne Trindade
 */
@ManagedBean
@RequestScoped
public class Cliente {    
    private static final String[] ESTADOS = { "AC", "AL", "AP", "AM", "CE", "DF", "ES", "GO", "MA", "MG", "MS" , "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "SC", "SE", "SP", "TO" };
    private String nome;
    private String email;
    private Telefone fone;
    @Past
    private Date data;
    private char sexo;
    @Min(10000000)
    private Integer cep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private List<String> servicos = new ArrayList<>();
    private double preco;

    /**
     * Creates a new instance of Cliente
     */
    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getFone() {
        return fone;
    }

    public void setFone(Telefone fone) {
        this.fone = fone;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<String> getServicos() {
        return servicos;
    }

    public void setServicos(List<String> servicos) {
        this.servicos = servicos;
    }

    public double getPreco() {
        return preco;
    }
    
    public List<SelectItem> getListaEstados() {
        List<SelectItem> estados = new ArrayList<>();
        SelectItem primeiro = new SelectItem("Selecione o estado");
        primeiro.setNoSelectionOption(true);
        estados.add(primeiro);
        for (String estado : ESTADOS) {
            estados.add(new SelectItem(estado));
        }
        return estados;
    }
    
    public String cadastrar() {
        preco = 0;        
        for (String s : servicos) {
            switch (s) {
                case "Telefonia": 
                    preco += 29.9;
                    break;
                case "TV":
                    preco += 39.9;
                    break;
                case "Internet":
                    preco += 49.9;
            }
        }
        if (servicos.size() == 3) {
            preco -= preco * 0.25;
        }
        return "/info";
    }
}
