/******f**********
    
    Assignment 6 Javascript
    Name: Salweyar Patel
    Date: November 10, 2019
    Description: JavaScript for assignment 6

*****************/

const itemDescription = ["MacBook", "The Razer", "WD My Passport", "Nexus 7", "DD-45 Drums"];
const itemPrice = [1899.99, 79.99, 179.99, 249.99, 119.99];
const itemImage = ["mac.png", "mouse.png", "wdehd.png", "nexus.png", "drums.png"];
let numberOfItemsInCart = 0;
let orderTotal = 0;


/*
 * Handles the submit event of the survey form
 *
 * param e  A reference to the event object
 * return   True if no validation errors; False if the form has
 *          validation errors
 */
function validate(e)
{
	hideErrors();

	if(formHasErrors()){
		// 	Prevents the form from submitting
		e.preventDefault();
		// 	Returning false prevents the form from submitting
		return false;
	}

	return true;
}

/*
 * Handles the reset event for the form.
 *
 * param e  A reference to the event object
 * return   True allows the reset to happen; False prevents
 *          the browser from resetting the form.
 */
function resetForm(e)
{
	// Confirm that the user wants to reset the form.
	if ( confirm('Clear order?') )
	{
		// Ensure all error fields are hidden
		hideErrors();
		
		// Set focus to the first text field on the page
		document.getElementById("qty1").focus();
		
		// When using onReset="resetForm()" in markup, returning true will allow
		// the form to reset
		return true;
	}

	// Prevents the form from resetting
	e.preventDefault();
	
	// When using onReset="resetForm()" in markup, returning false would prevent
	// the form from resetting
	return false;	
}

/*
 * Determines if a text field element has input
 *
 * param   fieldElement A text field input element object
 * return  True if the field contains input; False if nothing entered
 */
function formFieldHasInput(fieldElement)
{
	// Check if the text field has a value
	if ( fieldElement.value == null || trim(fieldElement.value) == "" )
	{
		// Invalid entry
		return false;
	}
	
	// Valid entry
	return true;
}

/*
 * Displays the error for an invalid form field.
 *
 * param formField A reference to the form field that caused a validation error.
 * param errorId   The id of the error element to display.
 * param errorFlag True (an error has already occured), False (no errors have occured thus far)
 */
function showError(formField, errorId, errorFlag)
{
	// Set the display style of the error element to diplay
	document.getElementById(errorId).style.display = "block";
	
	// Determine if this is the first error
	// If so, set focus to the text field
	if ( !errorFlag)
	{
		// Set focus to the text field that caused the error
		formField.focus();
		
		if ( formField.type == "text" )
		{
			// Select the text in the text field
			formField.select();
		}		
	}
}

/*This function will evaluate wheather your the credit card is valid or not
	the function has a arugument where it pass credit card number to validate */
function ValidateCC(ccnumber){
	var checkingFactors = "432765432";

	var Sum = 0;

	for(var i=0; i<checkingFactors.length; i++){
		Sum += parseInt(ccnumber.charAt(i)) * parseInt(checkingFactors.charAt(i));
	}

	return (ccnumber.charAt(ccnumber.length - 1) == (11 - (Sum % 11)));
}


/*
 * Does all the error checking for the form.
 *
 * return  True if an error was found; False if no errors were found
 */
function formHasErrors()
{	

	if(!(document.getElementById("noItems").style.display == "none")){
			alert("You have no items in your cart");
	}
	

	// Code below here
	var errorFlag = false;


	var requireTextFields = ["fullname","address","city","province","postal","email","cardname","month","cardnumber"];

	for(var i=0; i<requireTextFields.length; i++){
		var textField = document.getElementById(requireTextFields[i]);
			if(!formFieldHasInput(textField)){
			// display the appropriate error message
			document.getElementById(requireTextFields[i] + "_error").style.display = "block";
			
			if(!errorFlag){
				textField.focus();
				textField.select();
			}

			// raise the error flag
			errorFlag=true;
		}
		
	}

	// create a regural expression for six digit number
	var regex = new RegExp(/^[ABCEGHJKLMNPRSTVXY]\d[ABCEGHJKLMNPRSTVWXYZ]( )?\d[ABCEGHJKLMNPRSTVWXYZ]\d$/i);

	var postalCodeVale = document.getElementById("postal").value;

	//determine if the value passes the regex
		if(!regex.test(postalCodeVale)){
		document.getElementById("postalformat_error").style.display = "block";

		if(!errorFlag){
			textField.focus();
			textField.select();
		}

		//raise the error flag
		errorFlag=true;
	}

	// create a regural expression for six digit number
	var regex2 = new RegExp(/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/);

	var emailVale = document.getElementById("email").value;

	//determine if the value passes the regex
	if(!regex2.test(emailVale)){
		document.getElementById("emailformat_error").style.display = "block";

		if(!errorFlag){
			textField.focus();
			textField.select();
		}

		//raise the error flag
		errorFlag=true;
	}

	// validate the user select a progarm
	var program = ["visa","amex","mastercard"];
	var programCheck = false;

	for(var i=0; i<program.length && !programCheck; i++){
		if(document.getElementById(program[i]).checked){
			programCheck=true;
		}
	}

	if(!programCheck){
		document.getElementById("cardtype_error").style.display = "block";

		//raise the error flag
		errorFlag=true;
	}

//get date 
var date = new Date();
var month = date.getMonth() + 1; 
var year = date.getFullYear();

var mfield = document.getElementById("month");
var yfield = document.getElementById("year");

if(year > yfield.options[yfield.selectedIndex].value || (year == yfield.options[yfield.selectedIndex].value && month > mfield.options[mfield.selectedIndex].value)){
	showError(mfield, "expiry_error", errorFlag);

	errorFlag = true;
}



	// create a regural expression for six digit number
	/*var regex3 = new RegExp(/^\d{10}$/);

	var cardNumberVale = document.getElementById("cardnumber").value;

	//determine if the value passes the regex
	if(!regex3.test(cardNumberVale)){
		document.getElementById("invalidcard_error").style.display = "block";


		if(!errorFlag){
			textField.focus();
			textField.select();
		}

		//raise the error flag
		errorFlag=true;
	}*/

	 if(!formFieldHasInput(document.getElementById("cardnumber"))){
			showError(document.getElementById("cardnumber"), "cardnumber_error", errorFlag);

		//raise the error flag
		errorFlag=true;
	}
	else if(!ValidateCC(document.getElementById("cardnumber").value)){
		showError(document.getElementById("cardnumber"), "invalidcard_error", errorFlag);

		//raise the error flag
		errorFlag=true;
	}


	// Code above here
	return errorFlag;
}

/*
 * Adds an item to the cart and hides the quantity and add button for the product being ordered.
 *
 * param itemNumber The number used in the id of the quantity, item and remove button elements.
 */
function addItemToCart(itemNumber)
{
	// Get the value of the quantity field for the add button that was clicked 
	let quantityValue = trim(document.getElementById("qty" + itemNumber).value);

	// Determine if the quantity value is valid
	if ( !isNaN(quantityValue) && quantityValue != "" && quantityValue != null && quantityValue != 0 && !document.getElementById("cartItem" + itemNumber) )
	{
		// Hide the parent of the quantity field being evaluated
		document.getElementById("qty" + itemNumber).parentNode.style.visibility = "hidden";

		// Determine if there are no items in the car
		if ( numberOfItemsInCart == 0 )
		{
			// Hide the no items in cart list item 
			document.getElementById("noItems").style.display = "none";
		}

		// Create the image for the cart item
		let cartItemImage = document.createElement("img");
		cartItemImage.src = "images/" + itemImage[itemNumber - 1];
		cartItemImage.alt = itemDescription[itemNumber - 1];

		// Create the span element containing the item description
		let cartItemDescription = document.createElement("span");
		cartItemDescription.innerHTML = itemDescription[itemNumber - 1];

		// Create the span element containing the quanitity to order
		let cartItemQuanity = document.createElement("span");
		cartItemQuanity.innerHTML = quantityValue;

		// Calculate the subtotal of the item ordered
		let itemTotal = quantityValue * itemPrice[itemNumber - 1];

		// Create the span element containing the subtotal of the item ordered
		let cartItemTotal = document.createElement("span");
		cartItemTotal.innerHTML = formatCurrency(itemTotal);

		// Create the remove button for the cart item
		let cartItemRemoveButton = document.createElement("button");
		cartItemRemoveButton.setAttribute("id", "removeItem" + itemNumber);
		cartItemRemoveButton.setAttribute("type", "button");
		cartItemRemoveButton.innerHTML = "Remove";
		cartItemRemoveButton.addEventListener("click",
			// Annonymous function for the click event of a cart item remove button
			function()
			{
				// Removes the buttons grandparent (li) from the cart list
				this.parentNode.parentNode.removeChild(this.parentNode);

				// Deteremine the quantity field id for the item being removed from the cart by
				// getting the number at the end of the remove button's id
				let itemQuantityFieldId = "qty" + this.id.charAt(this.id.length - 1);

				// Get a reference to quanitity field of the item being removed form the cart
				let itemQuantityField = document.getElementById(itemQuantityFieldId);
				
				// Set the visibility of the quantity field's parent (div) to visible
				itemQuantityField.parentNode.style.visibility = "visible";

				// Initialize the quantity field value
				itemQuantityField.value = "";

				// Decrement the number of items in the cart
				numberOfItemsInCart--;

				// Decrement the order total
				orderTotal -= itemTotal;

				// Update the total purchase in the cart
				document.getElementById("cartTotal").innerHTML = formatCurrency(orderTotal);

				// Determine if there are no items in the car
				if ( numberOfItemsInCart == 0 )
				{
					// Show the no items in cart list item 
					document.getElementById("noItems").style.display = "block";
				}				
			},
			false
		);

		// Create a div used to clear the floats
		let cartClearDiv = document.createElement("div");
		cartClearDiv.setAttribute("class", "clear");

		// Create the paragraph which contains the cart item summary elements
		let cartItemParagraph = document.createElement("p");
		cartItemParagraph.appendChild(cartItemImage);
		cartItemParagraph.appendChild(cartItemDescription);
		cartItemParagraph.appendChild(document.createElement("br"));
		cartItemParagraph.appendChild(document.createTextNode("Quantity: "));
		cartItemParagraph.appendChild(cartItemQuanity);
		cartItemParagraph.appendChild(document.createElement("br"));
		cartItemParagraph.appendChild(document.createTextNode("Total: "));
		cartItemParagraph.appendChild(cartItemTotal);		

		// Create the cart list item and add the elements within it
		let cartItem = document.createElement("li");
		cartItem.setAttribute("id", "cartItem" + itemNumber);
		cartItem.appendChild(cartItemParagraph);
		cartItem.appendChild(cartItemRemoveButton);
		cartItem.appendChild(cartClearDiv);

		// Add the cart list item to the top of the list
		let cart = document.getElementById("cart");
		cart.insertBefore(cartItem, cart.childNodes[0]);

		// Increment the number of items in the cart
		numberOfItemsInCart++;

		// Increment the total purchase amount
		orderTotal += itemTotal;

		// Update the total puchase amount in the cart
		document.getElementById("cartTotal").innerHTML = formatCurrency(orderTotal);
	}		
}

/*
 * Hides all of the error elements.
 */
function hideErrors()
{
	// Get an array of error elements
	let error = document.getElementsByClassName("shippingError error");
	

	// Loop through each element in the error array
	for ( let i = 0; i < error.length; i++ )
	{
		// Hide the error element by setting it's display style to "none"
		error[i].style.display = "none";
	}

	let err =document.getElementsByClassName("cardTypeError error");
	for ( let i = 0; i < err.length; i++ )
	{
		// Hide the error element by setting it's display style to "none"
		err[i].style.display = "none";
	}


	let errorField = document.getElementsByClassName("cardError error");
	for ( let i = 0; i < errorField.length; i++ )
	{
		// Hide the error element by setting it's display style to "none"
		errorField[i].style.display = "none";
	}
}

/*
 * Handles the load event of the document.
 */
function load()
{

	hideErrors();

	//	Populate the year select with up to date values
	let year = document.getElementById("year");
	let currentDate = new Date();
	for(let i = 0; i < 7; i++){
		let newYearOption = document.createElement("option");
		newYearOption.value = currentDate.getFullYear() + i;
		newYearOption.innerHTML = currentDate.getFullYear() + i;
		year.appendChild(newYearOption);
	}

	// Add event listener for the form submit
	document.getElementById("orderform").addEventListener("submit", validate, false);

	// Reset the form using the default browser reset
	// This is done to ensure the radio buttons are unchecked when the page is refreshed
	// This line of code must be done before attaching the event listener for the customer reset
	document.getElementById("orderform").reset();

	// Add event listener for our custom form submit function
	document.getElementById("orderform").addEventListener("reset", resetForm, false);

	// Add event listeners for the radio buttons
	document.getElementById("addMac").addEventListener("click", 
		function(){
			addItemToCart("1");
		}
	);

	// Add event listeners for the radio buttons
	document.getElementById("addMouse").addEventListener("click", 
		function(){
			addItemToCart("2");
		}
	);

	// Add event listeners for the radio buttons
	document.getElementById("addWD").addEventListener("click", 
		function(){
			addItemToCart("3");
		}
	);

	// Add event listeners for the radio buttons
	document.getElementById("addNexus").addEventListener("click", 
		function(){
			addItemToCart("4");
		}
	);

	// Add event listeners for the radio buttons
	document.getElementById("addDrums").addEventListener("click", 
		function(){
			addItemToCart("5");
		}
	);

}

// Add document load event listener
document.addEventListener("DOMContentLoaded", load);












