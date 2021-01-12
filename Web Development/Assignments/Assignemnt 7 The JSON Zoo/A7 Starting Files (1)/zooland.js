/*
* Loads a JSON file and returns a DOM document node.
*/   


/*
 * Main function to load the page contents based on the data in the loaded JSON file
 */
function createZooland(zoolandData) {
    resetValues();
    var ul = document.getElementById("animals");

    for(var i = 0; i < zoolandData.length; i++){
       //   Retrieve and create a generic list of keys and values
        var keys = Object.keys(zoolandData[i]);
        var values = Object.values(zoolandData[i]);
        var image=Object.values(zoolandData[i].images.image);

        var li = document.createElement("li");
        var h3 = document.createElement("h3");
        var h4 = document.createElement("h4");
        var blockQuote = document.createElement("blockquote");

        h3.innerHTML = `${zoolandData[i].common_name}`;
        h4.innerHTML = `${zoolandData[i].scientific_name}`;
        blockQuote.innerHTML = `${zoolandData[i].description}`;

        li.appendChild(h3);
        li.appendChild(h4);
        li.appendChild(blockQuote);
        li.className="filter";
        ul.appendChild(li);

        
        //var img = zoolandData[i]["images"]["image"];

        for(var j=0; j < image.length; j++){
            var img = document.createElement("img");
            img.src = `images/${image[j]}`;
            li.appendChild(img);
        }

        if(i%2 != 0)
        {
            li.style.background="#d3d3d3";
        }
    }

}

/*
 * Takes the user input in the search text box and compares it against the animals in the xml file.
 * If the animal is found (case-insensitive) the list of animals is filtered to only show that animal.
 * If the animal is not found then an error message displays showing the user entered search item was not found
 */
function search(s) {
    //  Use the HTML DOM to search through the h3s and h4s for matches
    resetValues();
        let h3 = document.getElementsByTagName("h3");
        let h4 = document.getElementsByTagName("h4");
        let li=document.getElementsByClassName("filter");
        let sf = false;
        for(let i=0; i<h4.length; i++){
            var s1 = h3[i].innerHTML;
            var s2 = h4[i].innerHTML;
            if(s1.toLowerCase()==s.toLowerCase() || s2.toUpperCase()==s.toUpperCase())
            {
                li[i].style.display="block";
                sf=true;
            }
              else
            {
                li[i].style.display="none";
            }
        if(!sf)
        {
             document.getElementById("nomatches").innerHTML = s + " not found";
             document.getElementById("nomatches").style.display = "block";

        }
        else{
            document.getElementById("nomatches").style.display = "none";
        }
    }

}
/*
 * Turns on the display of all animals and turns off the display of the no matches error message
 */
function showAll() {
    resetValues();
    //return createZooland(zoolandData);
    let li=document.getElementsByClassName("filter");

     for(let i=0; i<li.length; i++)
    {
        li[i].style.display="block";
    }

    
}

/*
 * Turns off the display of the no matches error message and resets the
 * search field to blank
 */
function resetValues() {
    document.getElementById("nomatches").style.display = "none";
    document.getElementById("searchbox").value = "";
}

/*
 * Initial setup and adding of event listeners to the buttons and loading the page
 * dynamically from the xml file - run when the page loads
 */
function load() {

    resetValues();

    fetch('zooland.json')
        .then(function(result){
            return result.json();
        })
        .then(function(data){
            createZooland(data);
        });

    document.getElementById("searchbutton").addEventListener("click",
        function()
        {
            search(document.getElementById("searchbox").value);
        });
    document.getElementById("showallbutton").addEventListener("click",showAll);

    
}

//adds an event listener to execute onLoad method when page finished loading
document.addEventListener("DOMContentLoaded", load);