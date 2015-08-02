---
layout: disciplina
title:  "Desenvolvimento para dispositivos móveis I"
sigla: ISW-011
teacher: Chiara
date:   2015-01-01
grade: 2013
ciclo: 5
fatec: fatec-rl
categories: grade-2013 ciclo-5
---

<span class="label label-warning text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Fixo</span>

- [Moodle](http://fatecrl.edu.br/moodle/course/view.php?id=230) (senha: prdm20151)
- [jorgechiara@yahoo.com.br](jorgechiara@yahoo.com.br)

***

## Material, Apostilas e Ferramentas
- Android Studio [developer.android.com](http://developer.android.com/sdk/index.html)
- Eclipse ADT [adt-bundle-windows-x86_64-20130522.zip](https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=ksmGUc%2b1zSNNWZLDxHWqlJTc9OsTseYOIBqmeC6F99Y%3d&docid=0a25e4432d4c143eab5b192202015a546)
- XDK (intel) [software.intel.com/en-us/intel-xdk](https://software.intel.com/en-us/intel-xdk)
- Apache/Cordova (phonegap) [cordova.apache.org](https://cordova.apache.org/)
- Android Asset Studio (Gerador de Icons) [romannurik.github.io/AndroidAssetStudio](http://romannurik.github.io/AndroidAssetStudio/)
- Apostilas [E-book Use a Cabeça JAVA.pdf][URL_livro_ebook_usecabecaJava]
- Apostila Hello, Android [(The_Pragmatic_Programmers.pdf][(The_Pragmatic_Programmers.pdf]

***

## TPs e Provas

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> TP1</span>

**Conversor Farenheit<>Celsius**

Criar aplicativo que converta temperaturas de Farenheit para Celsius e visse-versa.

- Solução androidstudio: [URL_proj_androidstudio_TP1-ConversorTemperaturaFC][URL_proj_androidstudio_TP1-ConversorTemperaturaFC]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> TP2</span> 

**Intents Implícitas**

- Enunciado [Intents_Implicitas.pdf][Intents_Implicitas.pdf]
- Solução androidstudio: [URL_proj_androidstudio_TP2-IntentsImplicitas][URL_proj_androidstudio_TP2-IntentsImplicitas]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> P1</span> 

**Enunciado**

1. Fazer página mostrando apenas dados, nome, email e data de nascimento;
2. Fazer página que calcula Implicitas;
3. Fazer página MENSAGEM para preencher dois campos e enviar para outra página os dados.

- Solução androidstudio: [URL_proj_androidstudio_P1-Adam][URL_proj_androidstudio_P1-Adam]

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> P2</span> 

**Enunciado**

1. Fazer página de pre loading "SplashScreen";
2. Fazer app com paginas "cadastrar, lista, deletar e editar" palavras (titulo e significado);
3. Fazer página sobre o autor.

- Solução eclipseADT: [URL_proj_eclipseADT_PDM2_Adam][URL_proj_eclipseADT_PDM2_Adam]

**Screenshoots**

<div class="container-fluid">
    <div class="row">
        <div class="col-md-4">
            <img src="{{ site.url_content }}screenshot_p2_chiara_1.jpg" class="img-responsive">
        </div>
        <div class="col-md-4">
            <img src="{{ site.url_content }}screenshot_p2_chiara_2.jpg" class="img-responsive">
        </div>
        <div class="col-md-4">
            <img src="{{ site.url_content }}screenshot_p2_chiara_3.jpg" class="img-responsive">
        </div>
    </div>
</div>

***

## Aulas e Atividades


### Contéudo da Disciplina
- Activitys / Intents
- Componentes Visuais (Button, Text View, Text Field,  Tratando eventos, clique em botão) 
- CRUD com SQLite


### Projeto: Contador (incrementa e decrementa)

Programinha simples criado em aula que incrementa e decrementa valor.

- Solução androidstudio: [URL_proj_androidstudio_Contador][URL_proj_androidstudio_Contador]


### Componentes Visuais:
- Button que chama view (xml)
- Button que chama page externa (página de internet)
- Configuração do arquivo string.xml (nomes dos botôes)
- Criar Users Permissions

**Anotações**

- strings.xml: *localizado em*: **res** > **values** > **strings.xml**. É editado para as "variáveis de string" conter o valor dos nomes dos botões, txt... (os elementos das views (xml))
- Permissões: *localizado em*: Arquivo **AndroidManifest.xml** > (aba) **Permissions**. É possível criar as exeções que serão usadas na aplicação. As permissões já estão prontas, precisa add.
- Para finalizar uma Activity (arquivo view (xml)), use: *método* **finish**
- Chamando uma page externa da aplicação (page web):

{% highlight java %}
Uri uri = Uri.parse("http://www.google.com.br");
Intent it = new Intent(Intent.ACTION_VIEW, uri);
{% endhighlight %}


### Projeto: Intents Request Value

Digite um texto em um campo e envia para outra Intent. 

- Solução androidstudio: [URL_proj_androidstudio_IntentsRequestValue][URL_proj_androidstudio_IntentsRequestValue]


### Diferença entre Intents Explícita e Implícita

- **Explícita** Interação entre componentes de uma mesma aplicação.
- **Implícita** Interação entre componentes fora da aplicação, Internet, Chamadas e etc.


### Projeto: Intents Explicitas And Implicitas

Botão que envia para Intent explícita: IntentDois. 

Botão que envia para Intent implícita: google.com.br. 

- Solução androidstudio: [URL_proj_androidstudio_IntentsExplicitasAndImplicitas][URL_proj_androidstudio_IntentsExplicitasAndImplicitas]


### Projeto: ListActivity

Componente Visual: ListActivity - Lista de ações para chamar multiplas views (Activitys)

- Solução androidstudio: [URL_proj_androidstudio_ListActivity][URL_proj_androidstudio_ListActivity]
 

### Projeto: ActionBar

Exibe links no ActionBar (Barra de Menu) com icones ou não.

- Solução androidstudio: [URL_proj_androidstudio_ActionBar][URL_proj_androidstudio_ActionBar]


### Projeto: PersistenciaDadosSQLite (Livros) 

Cadastrar, Listar, Editar e Deletar Livros com SQLite.

- Solução androidstudio: [URL_proj_androidstudio_PersistenciaDadosSQLite][URL_proj_androidstudio_PersistenciaDadosSQLite]
- Solução eclipseADT: [URL_proj_eclipseADT_PersistenciaDadosSQLite][URL_proj_eclipseADT_PersistenciaDadosSQLite]


[URL_livro_ebook_usecabecaJava]: https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=exC7yg4Fh4Izgsbi2%2f6JhrI7YDAAfYtrNcBdKX3O4bQ%3d&docid=0d449a6fe69ae4b85944265337b790078
[(The_Pragmatic_Programmers.pdf]:https://www.dropbox.com/s/l5joxzafdo1hh5p/Hello%2C%20Android%20%28The%20Pragmatic%20Programmers%29.pdf?dl=0
[Intents_Implicitas.pdf]:https://www.dropbox.com/s/fk7jzdyp4hxsv71/Intents_Implicitas.pdf?dl=0
[URL_proj_androidstudio_TP1-ConversorTemperaturaFC]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/TP1-ConversorTemperaturaFC
[URL_proj_androidstudio_TP2-IntentsImplicitas]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/TP2-IntentsImplicitas
[URL_proj_androidstudio_P1-Adam]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/P1-Adam
[URL_proj_androidstudio_Contador]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/Contador
[URL_proj_androidstudio_IntentsRequestValue]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/IntentsRequestValue
[URL_proj_androidstudio_IntentsExplicitasAndImplicitas]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/IntentsExplicitasAndImplicitas 
[URL_proj_androidstudio_ListActivity]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/ListActivity
[URL_proj_androidstudio_ActionBar]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/ActionBar
[URL_proj_androidstudio_PersistenciaDadosSQLite]:{{ site.url_repository }}tree/gh-pages/content/workspace-androidstudio/PersistenciaDadosSQLite
[URL_proj_eclipseADT_PDM2_Adam]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipseADT/PDM2_Adam
[URL_proj_eclipseADT_PersistenciaDadosSQLite]:{{ site.url_repository }}tree/gh-pages/content/workspace-eclipseADT/PersistenciaDadosSQLite
