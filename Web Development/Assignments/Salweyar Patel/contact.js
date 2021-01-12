


/*
 * Hides all of the error elements.
 */
function hideErrors()
{
	// get an arry of the error field ids
	var errorFields = document.getElementsByClassName("feedbackerror");

	for(var i=0; i<errorFields.length; i++){
		errorFields[i].style.display = "none";

	}
}

/*
 * Handles the reset event for the form.
 *
 * param e A reference to the reset event
 * return  True allows the reset to happen; False prevents
 *         the browser from resetting the form.
 */
function resetForm(e)
{
	// Confirm that the user wants to reset the form.
	if ( confirm('Clear survey?') )
	{
		// Ensure all error fields are hidden
		hideErrors();
		
		// Set focus to the first text field on the page
		document.getElementById("fullname").focus();
		document.getElementById("fullname").select();
		
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
/*
 * Handles the submit event of the survey form
 *
 * param e  A reference to the submit event
 * return   True if no validation errors; False if the form has
 *          validation errors
 */
function validate(e)
{
	//	Hides all error elements on the page
	hideErrors();

	//	Determine if the form has errors
	if(formHasErrors()){
		// 	Prevents the form from submitting
		e.preventDefault();
		// 	Returning false prevents the form from submitting
		return false;
	}

	return true;
}


/*
 * Removes white space from a string value.
 *
 * return  A string with leading and trailing white-space removed.
 */
function trim(str) 
{
	// Uses a regex to remove spaces from a string.
	return str.replace(/^\s+|\s+$/g,"");
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

function handler(evt) {
    if (evt.type == "focus"){
        evt.target.style.backgroundColor = "#8AC7DB"; 
        evt.target.style.color = "red";
    }
}
function formHasErrors()
{
	// Code below here
	var errorFlag = false;

	var requireTextFields = ["fullname","email"];

	for(var i=0; i<requireTextFields.length; i++){
		var textField = document.getElementById(requireTextFields[i]);
			if(!formFieldHasInput(textField)){
			// display the appropriate error message
			document.getElementById(requireTextFields[i] + "_error").style.display = "block";
			
			if(!errorFlag){
				textField.focus();
				textField.select();	
				textField.addEventListener("focus", handler);
			}
			// raise the error flag
			errorFlag=true;
		}
	}

if(!formFieldHasInput(document.getElementById("phone"))){
			showError(document.getElementById("phone"), "p_error", errorFlag);

		//raise the error flag
		errorFlag=true;
	}
	var regex = new RegExp(/^\d{10}$/);

	var phoneVale = document.getElementById("phone").value;

	//determine if the value passes the regex
	if(!regex.test(phoneVale)){
		document.getElementById("invalidnum_error").style.display = "block";

		if(!errorFlag){
			textField.focus();
			textField.select();
			textField.addEventListener("focus", handler);
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
			textField.addEventListener("focus", handler);
		}
	
		//raise the error flag
		errorFlag=true;
	}

// Code above here
	return errorFlag;
}




/*
 * Handles the load event of the document.
 */
function load()
{

	hideErrors();


	// Add event listener for the form submit
	document.getElementById("feedback").addEventListener("submit", validate);

	// Add event listener for our custom form submit function
	document.getElementById("feedback").addEventListener("reset", resetForm);

}

// Add document load event listener
document.addEventListener("DOMContentLoaded", load);

