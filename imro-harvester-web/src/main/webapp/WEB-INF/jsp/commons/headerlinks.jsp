<%--
 Geo-OV - applicatie voor het registreren van KAR meldpunten               

 Copyright (C) 2009-2013 B3Partners B.V.                                   

 This program is free software: you can redistribute it and/or modify      
 it under the terms of the GNU Affero General Public License as            
 published by the Free Software Foundation, either version 3 of the        
 License, or (at your option) any later version.                           

 This program is distributed in the hope that it will be useful,           
 but WITHOUT ANY WARRANTY; without even the implied warranty of            
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the              
 GNU Affero General Public License for more details.                       

 You should have received a copy of the GNU Affero General Public License  
 along with this program. If not, see <http://www.gnu.org/licenses/>.      
--%>

<%@include file="/WEB-INF/jsp/taglibs.jsp" %>
<%@page errorPage="/WEB-INF/jsp/commons/errorpage.jsp" %>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">IMRO Harvester</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li id="home"><a href="<stripes:url beanclass="nl.b3p.imro.harvester.stripes.ViewActionBean"/>">Home</a></li>
                <li id="harvestjobs"><a href="<stripes:url beanclass="nl.b3p.imro.harvester.stripes.HarvestJobActionBean"/>">Harvesterjobs</a></li>
                <li id="harvestjobs"><a href="<stripes:url beanclass="nl.b3p.imro.harvester.stripes.AdminActionBean"/>">Beheer</a></li>
                <li id="harvestjobs"><a href="${contextPath}/about.jsp">Versie</a></li>
               
            </ul>
        </div>
    </div>
</nav>