---
title: Disciplinas
tagline: ""
layout: page
---
<ul>
    {% assign sorted_post = (site.posts | sort: 'ciclo') %}
    {% for post in sorted_post %}
        <li class="post">
            <a class="post-link" href="{{ post.url | prepend: site.baseurl }}">Ciclo {{ post.ciclo }} - {{ post.title }}</a> <small><span class="label label-success">{{ post.teacher }}</span></small>
            <small><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%b %-d, %Y" }}</time></small>
        </li>
    {% endfor %}
</ul>
