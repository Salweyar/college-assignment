/*****************

	Coding Challenge #5
	Name: 

	Purpose: recreate the effects used on CSSZenGarden

*****************/

document.addEventListener("DOMContentLoaded", function(){

	//	Grab the link element and the two anchor elements from the markup
		var link = document.getElementsByTagName("link")[0];
		var a = document.getElementsByTagName("a")[0];
		var a1 = document.getElementsByTagName("a")[1];
		
	// 	For the anchor elements, add event listeners to handle the click events
	//	When clicked, the link element's href attribute should be changed accordingly
		a.addEventListener("click", function()
			{ 
				link.setAttribute("href","style1.css")
		});
		
		
		
		a1.addEventListener("click", function()
			{
				link.setAttribute("href","style2.css")
		});

});







