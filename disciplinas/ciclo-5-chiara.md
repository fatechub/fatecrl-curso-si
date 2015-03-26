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

## Contador V5
Programinha simples criado em aula que incrementa e decrementa valor.

## Componentes Visuais:
- Button
- Text View
- Text Field
- Tratando eventos - clique em botão

## Download arquivos aula
[aula-2015-03-03-chiara-cV5.rar]({{ site.production_url }}/media/aula-2015-03-03-chiara-cV5.rar) 

> Projeto: ContadorV5

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

## Anotações
- strings.xml: *localizado em*: **res** > **values** > **strings.xml**. É editado para as "variáveis de string" conter o valor dos nomes dos botões, txt... (os elementos das views (xml))
- Permissões: *localizado em*: Arquivo **AndroidManifest.xml** > (aba) **Permissions**. É possível criar as exeções que serão usadas na aplicação. As permissões já estão prontas, precisa add.
- Para finalizar uma Activity (arquivo view (xml)), use: *método* **finish**
- Chamando uma page externa da aplicação (page web):
{% highlight java %}
  Uri uri = Uri.parse("http://www.google.com.br");
  Intent it = new Intent(Intent.ACTION_VIEW, uri);
{% endhighlight %}

## Download arquivos aula
[aula-2015-03-10-chiara.rar]({{ site.production_url }}/media/aula-2015-03-10-chiara.rar) 

> Projeto: Sobre

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 17/03</span>

## Componentes Visuais:
- Basicamente o que já havia dado

## Download arquivos aula
[aula-2015-03-17-chiara.rar]({{ site.production_url }}/media/aula-2015-03-17-chiara.rar) 

> Projetos: Intent01, Intent2Quinto, Intent2QuintoEclipse

***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 24/03</span>

<div class="alert alert-danger">Pendente conteudo. Ele passou ListMenu algo assim. **Pendrive Flávia**</div>

***

<span class="label label-success text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> TP 2 Lista com várias tarefas</span>

<div class="alert alert-danger">Publicar enunciado. **Pendrive Flávia**</div>

<div class="alert alert-danger">Publicar solução no <a href="https://github.com/adammacias/fatec-si/tree/androidstudioprojects">branch androidstudioprojects</a></div>
