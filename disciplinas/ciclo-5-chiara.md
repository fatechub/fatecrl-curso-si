---
layout: page
title: Ciclo 5 - Chiara - Programação para Dispositivos Móveis
header: Pages
group: navigation
---
{% include JB/setup %}

<span class="label label-warning text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Fixo</span>

- [Moodle](http://fatecrl.edu.br/moodle/course/view.php?id=230) - senha: prdm20151
- [Download Android Studio](http://developer.android.com/sdk/index.html)
- [jorgechiara@yahoo.com.br](jorgechiara@yahoo.com.br)
- [GitHub Branch: AndroidStudio (Projetos no AndroidStudio)](https://github.com/adammacias/fatec-si/tree/androidstudioprojects)
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

## Projeto: ContadorV5

Programinha simples criado em aula que incrementa e decrementa valor.

[aula-2015-03-03-chiara-cV5.rar]({{ site.production_url }}/media/aula-2015-03-03-chiara-cV5.rar) 

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> TP 1 Conversor Farenheit<>Celsius</span>

Criar aplicativo que converta temperaturas de Farenheit para Celsius e visse-versa.

[converta-temperaturas.gz]({{ site.production_url }}/media/converta-temperaturas.gz) - ou - [https://gist.github.com/flaviacs/4b521605740b07cb1fc8](https://gist.github.com/flaviacs/4b521605740b07cb1fc8).


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

## Projeto: Intent1

Botão que envia para Intent explícita: Sobre. 

Botão que envia para Intent implícita: fatecrl.edu.br. 

[aula-2015-03-10-chiara.rar]({{ site.production_url }}/media/aula-2015-03-10-chiara.rar) 

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 17/03</span>

## Diferença entre Intents Explícita e Implícita

Explícita

> *Interação entre componentes de uma mesma aplicação*.

Implícita

> *Interação entre componentes fora da aplicação, Internet, Chamadas e etc*.

## Projeto: Intent1 - II

Botão que envia para Intent explícita: Sobre. 

Botão que envia para Intent implícita: Google.com.br. 

[aula-2015-03-17-chiara.rar]({{ site.production_url }}/media/aula-2015-03-17-chiara.rar)

## Projeto: Intent2Quinto

Campo de texto simples, que envia valor para outra intent explícita "Sobre" e mostra o valor recebido, além disso, um Botão chamado "Fim", que finaliza o APP.

[aula-2015-03-17-chiara.rar]({{ site.production_url }}/media/aula-2015-03-17-chiara.rar)

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 24/03</span>

## Projeto Intent3Quinto

> Componente Visual: ListActivity - Lista de ações para chamar multiplas views (Activitys)

[aula-2015-03-24-chiara.rar]({{ site.production_url }}/media/aula-2015-03-24-chiara.rar) 

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span>TP 2 Android: Intents Implícitas</span>

- Enunciado [Intents_Implicitas.pdf]({{ site.production_url }}/media/Intents_Implicitas.pdf) 

<div class="alert alert-danger">Publicar solução no <a href="https://github.com/adammacias/fatec-si/tree/androidstudioprojects">branch androidstudioprojects</a></div>

***
