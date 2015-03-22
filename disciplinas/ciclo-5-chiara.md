---
layout: page
title: Ciclo 5 - Chiara - Programação para Dispositivos Móveis
header: Pages
group: navigation
---
{% include JB/setup %}

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Fixo</span>

- [Moodle](http://fatecrl.edu.br/moodle/course/view.php?id=230) - senha: prdm20151
- [Download Android Studio](http://developer.android.com/sdk/index.html)
- [jorgechiara@yahoo.com.br](jorgechiara@yahoo.com.br)

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

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 03/03</span>

## Contador V5
Programinha simples criado em aula que incrementa e decrementa valor.

## Componentes Visuais:
- Button
- Text View
- Text Field
- Tratando eventos - clique em botão

## TP Conversor Farenheit<>Celsius
Criar aplicativo que converta temperaturas de Farenheit para Celsius e visse-versa.

[Fazer Download]({{ site.production_url }}/media/gist4b521605740b07cb1fc8-c2e3ec1d74e8f76939031bdcf78859cfacb47af1.tar.gz) - ou - [ver no Gist](https://gist.github.com/flaviacs/4b521605740b07cb1fc8).

## Download arquivos aula
[Fazer Download]({{ site.production_url }}/media/aula-2015-03-03-chiara-cV5.rar) 

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
[Fazer Download]({{ site.production_url }}/media/aula-2015-03-10-chiara.rar) 


***

<span class="label label-primary text-uppercase"><span class="glyphicon glyphicon glyphicon-star"></span> Aula 17/03</span>

<div class="alert alert-info">Ele pediu trabalho. Em breve add os arquivos.</div>

## Componentes Visuais:
- Basicamente o que já havia dado

## Download arquivos aula
[Fazer Download]({{ site.production_url }}/media/aula-2015-03-17-chiara.rar) 
