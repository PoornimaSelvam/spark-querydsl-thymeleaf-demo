$(function() {
	
	$('#findbutton').click(function() {
		var searchtext = $('#subject').val();
		var data = {'subject': searchtext};
		
		$.ajax({
			type: "GET",
			data: data,
			url: "/subjects",
		    success: function(data) {
		    	$("#searchResults").html( response );
		    }
		});
	});
	
	$('#replacebutton').click(function() {
		var searchtext = $('#subject').val();
		var replacetext = $('#replace').val();
		
		var data = {'subject': searchtext, 'replace': replacetext};

		$.ajax({
			type: "PUT",
			data: data,
			url: "/subjects",
		    success: function(data) {
		    	$("#searchResults").html( response );
		    }
		});
	});
});