---
title: Contribuir
description: Seja um colaborador e ajude seus amiguinhos, e eles ajudaram de volta ♥
layout: page
---

## Como contribuir com o projeto

Existe duas formas de contribuir

### Issues

Simples como roubar doce de uma criança, [abria uma issue](https://github.com/fatechub/fatecrl-curso-si/issues/new) (tópico) e ajude com novo conteúdo, sugestões e etc.

### Pull Request

Requer um pouco de conhecimento de GIT, você pode contribuir através de **Pull Request**, clicando no botão **Fork**, criar um **Branch**, (criar/melhorar/arrumar) o código e nos enviar o **Pull Request**.

Mais detalhes de como contribuir e enviar Pull Requests em [GitHub Collaborating](https://help.github.com/categories/63/articles).

[Como colaborar com projetos opensource com GitHub](http://www.youtube.com/watch?v=H3olaBo83As)

## Criando uma disciplina

As disciplinas devem ser criada no diretório `disciplinas`, o arquivo deve ter o nomede de `index.md` e os nomes dos diretórios arquivos devem obedecer o formato abaixo:

`cicloX_siglaX_nomedadisciplinaX_docenteX/`

**Veja um exemplo:**

`disciplinas/ciclo5_ISW-011_desenvolvimento-para-dispositivos-moveis-I_chiara/index.md`

#### Front Matter

O arquivo deve conter antes de tudo, metadados para que o Jekyll possa rederizar de forma correta as disciplinas, veja um exemplo de **Front Matter**:

<pre>
{% raw %}---
layout: disciplina
title:  "Desenvolvimento para dispositivos móveis I"
sigla: ISW-011
teacher: Chiara
date:   2015-01-01
grade: 2013
ciclo: 5
fatec: fatec-rl
categories: grade-2013 ciclo-5
---{% endraw %}
</pre>
