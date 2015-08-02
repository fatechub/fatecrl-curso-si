---
title: Disciplinas
tagline: ""
layout: page
---

<ul class="list-group">
    {% assign pages = (site.pages | sort: 'ciclo') %}
    {% for post in pages %}
    {% if post.title and post.layout == "disciplina" %}
    <a class="list-group-item" href="{{ post.url | prepend: site.baseurl }}">        
        <b>Ciclo {{ post.ciclo }}</b> - {{ post.sigla }} - {{ post.title }}
        <span class="small label label-success">{{ post.teacher }}</span>
        <span class="badge">{{ post.date | date: "%m" }} SEM. {{ post.date | date: "%Y" }}</span>
    </a> 
    {% endif %}
    {% endfor %}
</ul>

