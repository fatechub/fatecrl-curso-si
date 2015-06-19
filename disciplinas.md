---
title: Disciplinas
tagline: ""
layout: page
---
<ul>
    {% for post in site.posts %}
        <li class="post">
            <a class="post-link" href="{{ post.url | prepend: site.baseurl }}">{{ post.title }}</a> <small><span class="label label-default">{{ post.teacher }}</span> <span class="label label-success">{{ post.fatec }}</span></small>
            <small><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%b %-d, %Y" }}</time></small>
        </li>
    {% endfor %}
</ul>
