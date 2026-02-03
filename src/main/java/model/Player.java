package model;


import jakarta.persistence.*;

@Entity
@Table(name = "players", schema = "wow")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String classe;
    private String spec;

    private int bisObtidos;
    private int bisTotal;

    // construtor vazio obrigatório JPA
    public Player() {}

    public Player(String name, String classe, String spec, int bisTotal) {
        this.name = name;
        this.classe = classe;
        this.spec = spec;
        this.bisTotal = bisTotal;
        this.bisObtidos = 0;
    }

    // getters e setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public String getSpec() { return spec; }
    public void setSpec(String spec) { this.spec = spec; }

    public int getBisObtidos() { return bisObtidos; }
    public void setBisObtidos(int bisObtidos) { this.bisObtidos = bisObtidos; }

    public int getBisTotal() { return bisTotal; }
    public void setBisTotal(int bisTotal) { this.bisTotal = bisTotal; }
}
