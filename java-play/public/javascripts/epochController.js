var getTime = function() {
  $.getJSON('/epoch', function(data) {
    $(".message").html(data.epochTime);
  });
}

$(function() {

  getTime();

  $('#refreshTime').click(function() {
    getTime();
  });

});
