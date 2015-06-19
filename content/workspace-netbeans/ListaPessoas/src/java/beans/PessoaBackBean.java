package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaBackBean {

    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoas = new ArrayList<>();

    public PessoaBackBean() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String cadastrarPessoa() {
        pessoas.add(pessoa);
        pessoa = new Pessoa();
        return null;
    }
    
    public String deleteRow(Pessoa personToDelete){
        pessoas.remove(personToDelete);
        return null;
    }

}
