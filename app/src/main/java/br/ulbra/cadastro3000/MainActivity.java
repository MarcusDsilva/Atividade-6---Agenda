package br.ulbra.cadastro3000;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnPrincipal,  btncadastro, btnlistar1, btnlis, btnlistar2, btnCadastrar;
        EditText edtnome, edtendereço, edttelefone;
         MainActivity act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        telaPrincipal();
    }
    public void telaPrincipal(){
        setContentView(R.layout.tela_principal);
        btncadastro=(Button) findViewById(R.id.btncadastro);
        btnlistar1 = (Button) findViewById(R.id.btnlistar1);

        btnlistar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {telaVisualização();}
        });


        btncadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {telaCadastro();}
        });

    }

    public void telaVisualização(){
        setContentView(R.layout.tela_de_visualizacao);
        btnPrincipal =  (Button)findViewById(R.id.btnPrin);
        btnlis=(Button) findViewById(R.id.btnlis);

        btnPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {telaPrincipal();}
        });


        btnlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {telaCadastro();}{

            }
        });

    }

    public void telaCadastro(){


    setContentView(R.layout.tela_de_cadastro);
    btnPrincipal =  (Button)findViewById(R.id.btnPrincipal);
    btnlistar2 =  (Button)findViewById(R.id.btnlistar2);
    btnPrincipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {telaPrincipal();}
    });

    btnlistar2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {telaVisualização();} {
        }
    });
        edtnome = (EditText) findViewById(R.id.edtnome);
        edtendereço = (EditText) findViewById(R.id.edtendereço);
        edttelefone = (EditText) findViewById(R.id.edttelefone);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuario ?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                      String nome = edtnome.getText().toString();
                      String telefone = edttelefone.getText().toString();
                      String endereco = edtendereço.getText().toString();
                       act.getRegistros
                    }
                        });
            }});
    }



    public class Registro{
        private String nome;
        private String telefone;
        private String endereco;
        public Registro(String nome, String telefone, String endereco){
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
        }
        public String getNome(){
            return nome;
        }
        public String getTelefone(){
            return telefone;
        }
        public String getEndereco(){
            return endereco;
        }
    }

public class MainActivity extends Activity{
    private ArrayList<Registro> aRegistro;
    TelaPrincipal tela_prin;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

@Override
    protected void onCreate(Bundle savedlnstanceState){
    super.onCreate(savedlnstanceState);
    aRegistro = new ArrayList<Registro>();
    tela_prin = new TelaPrincipal(this);
    tela_cadastro = new TelaCadastroUsuario(this, tela_prin);
    tela_listagem = new TelaListagemUsuarios(this, tela_prin);  tela_principal.setTelaCadastro(tela_cadastro);
    tela_prin.setTelaListagem(tela_listagem);
    tela_prin.CarregarTela();
}
public ArrayList<Registro> getRegistro(){
    return aRegistro;
}
public void ExibirMensagem(String msg){
    AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
    d.setTitle("Aviso");
    d.setMessage(msg);
    d.setNeutralButton("OK", null);   d.show();
}
}

    public class TelaPrincipal{
        MainActivity act;
        Button btncadastro;
        Button btnlistar1;
        TelaCadastroUsuario tela_cadastro;
        TelaListagemUsuarios tela_listagem;
        public TelaPrincipal(MainActivity act){
            this.act = act;
        }
           public void CarregarTela(){
            act.setContentView(R.layout.tela_principal);
            btncadastro = (Button) act.findViewById(R.id.btncadastro);
            btnlistar1 = (Button) act.findViewById(R.id.btnlistar1);
            btncadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tela_cadastro.CarregarTela
                  }});
            btnlistar1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tela_visualizacao.CarregarTela
                }
            });}
public void setTelaCadastro(TelaCadastroUsuario tela_cadastro){
            this.tela_cadastro = tela_cadastro;
}
public void setTelaListagem(TelaListagemUsuarios tela_listagem){
            this.tela_listagem = tela_listagem;
}
}

public class TelaCadastroUsuario{
        MainActivity act;
        EditText edtnome, edtendereço, edttelefone;
        Button btnCadastrar;
        TelaPrincipal tela_prin;

        public TelaCadastroUsuario(
                MainActivity act, TelaPrincipal tela_prin){
            this.act = act;
            this.tela_prin = tela_prin;
        }
    public void CarregarTela(){
     act.setContentView(R.layout.tela_de_cadastro);
     edtnome = (EditText) act.findViewById(R.id.edtnome);
     edtendereço = (EditText) act.findViewById(R.id.edtendereço);
     edttelefone = (EditText) act.findViewById(R.id.edttelefone);
     btnCadastrar = (Button) act.findViewById(R.id.btnCadastrar);
     btnCadastrar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
             dialogo.setTitle("Aviso");
             dialogo.setMessage("Cadastro usuario ?");
             dialogo.setNegativeButton("não", null);
             dialogo.setPositiveButton("sim", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                   String nome = edtnome.getText().toString();
                   String telefone = edttelefone.getText().toString();
                   String endereco = edtendereço.getText().toString();
                   act.getRegistro().add(newRegistro(nome,telefone,endereco));
                   act.ExibirMensagem("Cadastro efetuado com sucesso");
                   tela_prin.CarregarTela();
                 }
             });
             dialogo.show();
         }});

    }
    }
    }

public void setTe









