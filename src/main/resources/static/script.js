function getAll() {
    fetch("/getTickets")
        .then(response => response.json())
        .then(ticket => showTicketList(ticket))
        .catch(error => console.error('Error fetching tickets:', error));
}


function testThis(){

    let movieSelection = document.getElementById("movieSelection").value;
    let amount = document.getElementById("amount").value;
    let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let phoneNumber = document.getElementById("phoneNumber").value;
    let email = document.getElementById("email").value;

    let ticket = {
        //creates ticket objects
        movieSelection: movieSelection,
        amount: amount,
        firstName: firstName,
        lastName: lastName,
        phoneNumber: phoneNumber,
        email: email
    }

    console.log(movieSelection);
    console.log(amount);
    console.log(firstName);
    console.log(lastName);
    console.log(phoneNumber);
    console.log(email);

    /*
    $.ajax({
        type: "POST",
        url: "/addTicket",
        contentType: "application/json",
        data: JSON.stringify(ticket),
        success: function() {
            console.log("Ticket added successfully.");
            getAll();
        },
        error: function(xhr, status, error) {
            console.error("Error adding ticket:", error);
        }
    });
    console.log("Ticket data:", JSON.stringify(ticket));
*/


}

function showTicketList(ticket) {
    let stuff = "<table><tr>" +
        "<th>Movie</th> <th>Amount</th>" +
        "<th>First name</th> <th>Last name</th>" +
        "<th>Phone number</th> <th>E-mail</th>" +
        "</tr>";
    ticket.forEach(ticket => {
        stuff += "<tr>";
        stuff +=
            "<td>" + ticket.movieSelection + "</td>" +
            "<td>" + ticket.amount + "</td>" +
            "<td>" + ticket.firstName + "</td>" +
            "<td>" + ticket.lastName + "</td>" +
            "<td>" + ticket.phoneNumber + "</td>" +
            "<td>" + ticket.email + "</td>" +
            "<td>" + ticket.id + "</td>";
        stuff += "</tr>";
        console.log(ticket);
    });
    document.getElementById("allTickets").innerHTML = stuff;

}