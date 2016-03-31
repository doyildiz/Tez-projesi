<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import="com.servlet.Gen" %>
<!DOCTYPE html>
<html lang="en-US"><head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>



<title> IZMIR INSTITUTE OF TECHNOLOGY</title>


<link rel="icon" type="image/png" href="http://demo.iyte.edu.tr/taslak/wp-content/uploads/2015/03/favicon.ico">


<link rel="stylesheet" type="text/css" href="http://efesezginlab.iyte.edu.tr/wp-content/themes/Office/style.css">


	<link rel="stylesheet" type="text/css" href="http://efesezginlab.iyte.edu.tr/wp-content/themes/Office/css/ie8.css" media="screen" />



	<link rel="stylesheet" type="text/css" href="http://efesezginlab.iyte.edu.tr/wp-content/themes/Office/css/ie7.css" media="screen" />


<!-- Load HTML5 dependancies for IE
================================================== -->
<!--[if IE]>
	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<!--[if lte IE 7]>
	<script src="js/IE8.js" type="text/javascript"></script><![endif]-->
<!--[if lt IE 7]>
	<link rel="stylesheet" type="text/css" media="all" href="css/ie6.css"/>
<![endif]-->

<!-- WP Head
================================================== -->
<link rel="stylesheet" id="responsive-css" href="http://efesezginlab.iyte.edu.tr/wp-content/themes/Office/css/responsive.css?ver=3.5.1" type="text/css" media="all">
<link rel="stylesheet" id="prettyPhoto-css" href="http://efesezginlab.iyte.edu.tr/wp-content/themes/Office/css/prettyPhoto.css?ver=3.5.1" type="text/css" media="all">
<link rel="stylesheet" id="gh-buttons-css" href="http://efesezginlab.iyte.edu.tr/wp-content/themes/Office/css/gh-buttons.css?ver=3.5.1" type="text/css" media="all">
<div class="fit-vids-style"><style>         
      .fluid-width-video-wrapper {        
         width: 100%;                     
         position: relative;              
         padding: 0;                      
      }                                   
                                          
      .fluid-width-video-wrapper iframe,  
      .fluid-width-video-wrapper object,  
      .fluid-width-video-wrapper embed {  
         position: absolute;              
         top: 0;                          
         left: 0;                         
         width: 100%;                     
         height: 100%;                    
      }                                   
    </style></div><script type="text/javascript" src="http://efesezginlab.iyte.edu.tr/wp-includes/js/jquery/jquery.js?ver=1.8.3"></script>
<link rel="EditURI" type="application/rsd+xml" title="RSD" href="http://efesezginlab.iyte.edu.tr/xmlrpc.php?rsd">
<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="http://efesezginlab.iyte.edu.tr/wp-includes/wlwmanifest.xml"> 


<meta http-equiv="Content-Language" content="en-US">
<style type="text/css" media="screen">
.qtrans_flag span { display:none }
.qtrans_flag { height:12px; width:18px; display:block }
.qtrans_flag_and_text { padding-left:20px }
.qtrans_flag_en { background:url(http://efesezginlab.iyte.edu.tr/wp-content/plugins/qtranslate/flags/gb.png) no-repeat }
.qtrans_flag_tr { background:url(http://efesezginlab.iyte.edu.tr/wp-content/plugins/qtranslate/flags/tr.png) no-repeat }
</style>
<link hreflang="tr" href="http://efesezginlab.iyte.edu.tr/" rel="alternate">
<script type="text/javascript">
(function(url){
if(/(?:Chrome\/26\.0\.1410\.63 Safari\/537\.31|WordfenceTestMonBot)/.test(navigator.userAgent)){ return; }
var wfscr = document.createElement('script');
wfscr.type = 'text/javascript';
wfscr.async = true;
wfscr.src = url + '&r=' + Math.random();
(document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(wfscr);
})('//efesezginlab.iyte.edu.tr/wp-admin/admin-ajax.php?action=wordfence_logHuman&hid=83D61F92CDC111D3C4397ADDDE721E63');
</script><script type="text/javascript" async="" src="//efesezginlab.iyte.edu.tr/wp-admin/admin-ajax.php?action=wordfence_logHuman&amp;hid=83D61F92CDC111D3C4397ADDDE721E63&amp;r=0.1389915859351869"></script>

</head>

<!-- Begin Body
================================================== -->
<body class="home blog">


<header id="header" class="clearfix header-style-three">

    <div id="logo">
                    <a href="http://efesezginlab.iyte.edu.tr/" title="IZMIR INSTITUTE OF TECHNOLOGY" rel="home"><img src="http://efesezginlab.iyte.edu.tr/wp-content/uploads/2016/01/header_en.png" alt="IZMIR INSTITUTE OF TECHNOLOGY"></a>
	<a href="http://www.iyte.edu.tr" target="_blank" class="hidden_iyte">ÝYTE</a>
            </div>
    <!-- /logo -->
    
    <div id="header-aside">
    			
            </div>
    <!--/header-aside -->
     <div id="langs">
							<ul class="qtrans_language_chooser" id="qtranslate-chooser"><li class="active"><a href="http://efesezginlab.iyte.edu.tr/en/" class="qtrans_flag_en qtrans_flag_and_text" title="English"><span>English</span></a></li><li><a href="http://efesezginlab.iyte.edu.tr/" class="qtrans_flag_tr qtrans_flag_and_text" title="Türkçe"><span>Türkçe</span></a></li></ul><div class="qtrans_widget_end"></div>						</div>         
</header><!-- /header -->

<div id="wrap" class="clearfix">

    <nav id="navigation" class="clearfix">
        <div class="menu-home-container">
<ul id="menu-home" class="sf-menu sf-js-enabled sf-shadow">
<li id="menu-item-1528" class="icon-home menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-1528">
<a href="giris.jsp">Home</a></li>
<li id="menu-item-1531" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-1531">
<a href="index.jsp">Disease</a>
</li>
<li id="menu-item-1535" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-1535">
<a href="genbul.jsp">Genes</a></li>
<li id="menu-item-1535" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-1539">
<a href="http://iyte.edu.tr">IYTE</a></li>
</ul>
</ul>
</div>    <div class="selector" id="uniform-undefined"><span>HASTALIKLAR</span><select style="opacity: 0;"><option selected="selected" value="">Obezite</option><option value="http://efesezginlab.iyte.edu.tr">Metabolik Sendrom</option></select></div></nav>
    <!-- /navigation -->  
        
        
	<div class="container clearfix fitvids">
    
<div class="home-wrap clearfix">







</div>
<!-- END home-wrap -->   

<div class="clear"></div>
</div><!-- /container -->



<%
ArrayList<Gen> myList = (ArrayList<Gen>) request.getAttribute("genbilgisi"); 
String hastalik_adi=(String) request.getAttribute("hastalik_adi");

String[] s2 = (String[]) request.getAttribute("baslikbilgisi");
//String[] s3=null;
%>
<br>
<br>
<%
out.write(hastalik_adi);
%>
hastaliginda bulunan genler: 
<%
for(int a=0; a<myList.size();a++){
	if(a+1==myList.size())
		out.write(myList.get(a).getSymbol());
	else
	out.write(myList.get(a).getSymbol()+", " );
}

%>
<br>
<br>
<%


for(int i=0; i<myList.size();i++)
{
	out.write(myList.get(i).getSymbol() +" geni ile ilgili bilgiler <br>");
	out.write("*"+s2[0]);
	out.write(" = ");
	out.write(myList.get(i).getTax_id() + "<br>");
	out.write("*"+s2[1]);
	out.write(" = ");
	out.write(myList.get(i).getGene_id() + "<br>");
	out.write("*"+s2[2]);
	out.write(" = ");
	out.write(myList.get(i).getSymbol() + "<br>");
	out.write("*"+s2[3]);
	out.write(" = ");
	out.write(myList.get(i).getLocusTag() + "<br>");
	out.write("*"+s2[4]);
	out.write(" = ");
	out.write(myList.get(i).getSynonyms() + "<br>");
	out.write("*"+s2[5]);
	out.write(" = ");
	out.write(myList.get(i).getDbXrefs() + "<br>");
	out.write("*"+s2[6]);
	out.write(" = ");
	out.write(myList.get(i).getChromosome() + "<br>");
	out.write("*"+s2[7]);
	out.write(" = ");
	out.write(myList.get(i).getMap_location() + "<br>");
	out.write("*"+s2[8]);
	out.write(" = ");
	out.write(myList.get(i).getDescription() + "<br>");
	out.write("*"+s2[9]);
	out.write(" = ");
	out.write(myList.get(i).getType_of_gene() + "<br>");
	out.write("*"+s2[10]);
	out.write(" = ");
	out.write(myList.get(i).getSymbol_from_nomenclature_authority() + "<br>");
	out.write("*"+s2[11]);
	out.write(" = ");
	out.write(myList.get(i).getFull_name_from_nomenclature_authority() + "<br>");
	out.write("*"+s2[12]);
	out.write(" = ");
	out.write(myList.get(i).getNomenclature_status() + "<br>");
	out.write("*"+s2[13]);
	out.write(" = ");
	out.write(myList.get(i).getOther_designations() + "<br>");
	out.write("*"+s2[14]);
	out.write(" = ");
	out.write(myList.get(i).getModification_date() + "<br>");
	out.write("<br>");
	%>
	<%out.write(myList.get(i).getSymbol()); %>
	
	geni ile ilgili daha fazla bilgi almak icin

<a href=http://www.ncbi.nlm.nih.gov/gene/?term=<%=myList.get(i).getSymbol() %>>BURAYA TIKLAYINIZ</a>
<br>
<hr>
<br>

	<% 
	
}
	


%>
<br>
<br>


 <footer id="footer">
    
    	        <div id="footer-widget-wrap" class="clearfix">
    
            <div id="footer-left">
            	            </div>
            <!-- /footer-left -->
            
            <div id="footer-middle">
            	            </div>
            <!-- /footer-middle -->
            
            <div id="footer-right">
            	            </div>
            <!-- /footer-right -->
        
        </div>
        <!-- /footer-widget-wrap -->
                
        <a href="#toplink" id="toplink">back up ^</a>
    
    </footer>
    <!-- /footer -->
    
</div>
<!-- /wrap -->

    <div id="footer-bottom" class="clearfix">
    
        <div id="copyright">
            © Copyright 2015 IZMIR INSTITUTE OF TECHNOLOGY        </div>
        <!-- /copyright -->
        
        <div id="footer-menu">
                    </div>
        <!-- /footer-menu -->
    
    </div>
    <!-- /footer-bottom -->
    



</body></html>