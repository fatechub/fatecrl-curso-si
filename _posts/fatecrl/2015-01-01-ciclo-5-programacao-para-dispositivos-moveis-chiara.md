---
layout: post
title:  "Programação para Dispositivos Móveis"
fatec: fatec-rl
ciclo: 5
teacher: Chiara
date:   2015-01-01
categories: grade-2013 ciclo-5 fatec-rl
---

<span class="label label-warning text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Fixo</span>

- [Moodle](http://fatecrl.edu.br/moodle/course/view.php?id=230) - senha: prdm20151
- [Download Android Studio](http://developer.android.com/sdk/index.html)
- [jorgechiara@yahoo.com.br](jorgechiara@yahoo.com.br)
- [adt-bundle-windows-x86_64-20130522.zip](https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=ksmGUc%2b1zSNNWZLDxHWqlJTc9OsTseYOIBqmeC6F99Y%3d&docid=0a25e4432d4c143eab5b192202015a546)
- [Android Asset Studio - Gerador de Icons](http://romannurik.github.io/AndroidAssetStudio/)
- [GitHub Branch: AndroidStudio (Projetos no AndroidStudio)]({{ site.url_repository }}tree/androidstudioprojects)
- [GitHub Branch: eclipseadtprojects (Projetos no Eclipse ADT)]({{ site.url_repository }}tree/eclipseadtprojects)
- [E-book Use a Cabeça JAVA.pdf](https://fatecspgov-my.sharepoint.com/personal/adam_macias_fatec_sp_gov_br/_layouts/15/guestaccess.aspx?guestaccesstoken=exC7yg4Fh4Izgsbi2%2f6JhrI7YDAAfYtrNcBdKX3O4bQ%3d&docid=0d449a6fe69ae4b85944265337b790078)

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 10/02</span>

## Bibliografia
- (ele vai dar pdf de livro)
- developer.android.com
- www.openhandsetalliance.com
 
## Ferramentas
- XDK (intel)
- apache/cordova (phonegap)
 
## Ambientes
- mater android (pacotes)
  - android sdk 
  - plugin adt
- android studio (OU)

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 24/02</span>

## Instalação do ADT (eclipse) ou o Android Toolkit (Android Studio)
[Download Android Studio](http://developer.android.com/sdk/index.html)

## Apostila Hello, Android (The Pragmatic Programmers)
[Hello, Android (The Pragmatic Programmers).pdf](https://www.facebook.com/download/780007602089838/Hello%2C%20Android%20%28The%20Pragmatic%20Programmers%29.pdf)

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 03/03</span>

## Componentes Visuais:
- Button
- Text View
- Text Field
- Tratando eventos - clique em botão

### Projeto: Contador (incrementa e decrementa)

Programinha simples criado em aula que incrementa e decrementa valor.

- Branch: [androidstudioprojects/Contador]({{ site.url_repository }}tree/androidstudioprojects/Contador)  

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> TP 1 Conversor Farenheit<>Celsius</span>

Criar aplicativo que converta temperaturas de Farenheit para Celsius e visse-versa.

- Branch: [androidstudioprojects/TP1-ConversorTemperaturaFC]({{ site.url_repository }}tree/androidstudioprojects/TP1-ConversorTemperaturaFC)  


***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 10/03</span>

## Componentes Visuais:
- Button que chama view (xml)
- Button que chama page externa (página de internet)
- Configuração do arquivo string.xml (nomes dos botôes)
- Criar Users Permissions

### Anotações
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

- Branch: [androidstudioprojects/IntentsRequestValue]({{ site.url_repository }}tree/androidstudioprojects/IntentsRequestValue)  

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 17/03</span>

## Diferença entre Intents Explícita e Implícita

Explícita

> *Interação entre componentes de uma mesma aplicação*.

Implícita

> *Interação entre componentes fora da aplicação, Internet, Chamadas e etc*.

### Projeto: Intents Explicitas And Implicitas

Botão que envia para Intent explícita: IntentDois. 

Botão que envia para Intent implícita: google.com.br. 

- Branch: [androidstudioprojects/IntentsExplicitasAndImplicitas]({{ site.url_repository }}tree/androidstudioprojects/IntentsExplicitasAndImplicitas)  

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 24/03</span>

### Projeto: ListActivity

> Componente Visual: ListActivity - Lista de ações para chamar multiplas views (Activitys)

- Solução Branch: [androidstudioprojects/ListActivity]({{ site.url_repository }}tree/androidstudioprojects/ListActivity)  

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span>TP 2 Android: Intents Implícitas</span> 

- Enunciado [Intents_Implicitas.pdf]({{ site.production_url }}/media/Intents_Implicitas.pdf) 
- Solução Branch: [androidstudioprojects/TP2-IntentsImplicitas]({{ site.url_repository }}tree/androidstudioprojects/TP2-IntentsImplicitas)  
- Solução Felipe Lage: [androidstudioprojects/Intents-LAGE.zip]({{ site.url_repository }}blob/androidstudioprojects/Intents-LAGE.zip)  

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 31/03</span>

### Projeto: ActionBar 

Exibe links no ActionBar (Barra de Menu) com icones ou não. 

- Solução Branch: [androidstudioprojects/ActionBar]({{ site.url_repository }}tree/androidstudioprojects/ActionBar)  

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Prova P1</span> 

1. Fazer página mostrando apenas dados, nome, email e data de nascimento;
2. Fazer página que calcula Implicitas;
3. Fazer página MENSAGEM para preencher dois campos e enviar para outra página os dados.

- Solução Adam Branch: [androidstudioprojects/P1-Adam]({{ site.url_repository }}tree/androidstudioprojects/P1-Adam) 


***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 26/05</span>

### Projeto: PersistenciaDadosSQLite (Livros) 

Cadastrar, Listar, Editar e Deletar Livros com SQLite.

- Solução JAVA AS: [androidstudioprojects/PersistenciaDadosSQLite]({{ site.url_repository }}tree/androidstudioprojects/PersistenciaDadosSQLite)  
- Solução JAVA ADT: [eclipseadtprojects/PersistenciaDadosSQLite]({{ site.url_repository }}tree/eclipseadtprojects/PersistenciaDadosSQLite)  

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Prova P2</span> 

1. Fazer página de pre loading "SplashScreen";
2. Fazer app com paginas "cadastrar, lista, deletar e editar" palavras (titulo e significado);
3. Fazer página sobre o autor.

- Solução Adam Branch: [eclipseadtprojects/PDM2_Adam]({{ site.url_repository }}tree/eclipseadtprojects/PDM2_Adam) 

**Screenshoots**

<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<img src="{{ site.production_url }}/media/screenshot_p2_chiara_1.jpg" class="img-responsive">
		</div>
		<div class="col-md-4">
			<img src="{{ site.production_url }}/media/screenshot_p2_chiara_2.jpg" class="img-responsive">
		</div>
		<div class="col-md-4">
			<img src="{{ site.production_url }}/media/screenshot_p2_chiara_3.jpg" class="img-responsive">
		</div>
	</div>
</div>
