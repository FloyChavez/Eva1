<%@page import="bean.Pelicula"%> <%@ page    pageEncoding="UTF-8"%>

<% String[] aPelicula =(String[]) session.getAttribute("aPelicula");%>

<br/><h1>Cartelera</h1><br/>
	<div class="contenido-pelicula">
		<div class="datos-pelicula">
			<h2><%= aPelicula[1]%></h2>
			<p> <%= aPelicula[10]%></p>
			<br/>
			<div class="tabla">
				<div class="fila">
					<div class="celda-titulo">Título Original :</div>
					<div class="celda"><%= aPelicula[1]%></div>
				</div>
				<div class="fila">
					<div class="celda-titulo">Estreno :</div>
					<div class="celda"><%= aPelicula[2]%></div>
				</div>
				<div class="fila">
					<div class="celda-titulo">Género :</div>
					<div class="celda"><%= aPelicula[4]%></div>
				</div>
				<div class="fila">
					<div class="celda-titulo">Director :</div>
					<div class="celda"><%= aPelicula[3]%></div>
				</div>
				<div class="fila">
					<div class="celda-titulo">Reparto :</div>
					<div class="celda"><%= aPelicula[10]%></div>
				</div>
			</div>
		</div>
		<img src="img/pelicula/<%= aPelicula[0]%>.jpg" width="160" height="226"><br/><br/>
	</div>
	<div class="pelicula-video">
		<!-- <iframe width="580" height="400" src="http://www.youtube.com/v/6maujJFcuxA" frameborder="0" allowfullscreen></iframe> -->
		<embed src="http://www.youtube.com/v/<%= aPelicula[8]%>" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="580" height="400">
	</div>