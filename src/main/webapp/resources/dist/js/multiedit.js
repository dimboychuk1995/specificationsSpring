/**
 * Created by us9522 on 27.02.2017.
 */
function multiedit(){
    $(".multiedit").click(function(){
        var $txar = $(this).prev('.edit');
        $(this).next('.hide_list').dialog({
            width:800,
            modal:true,
            close: function(event, ui) { $(this).dialog( 'destroy' );},
            buttons: {
                "OK": function() {
                    var $per = $(this).parents();
                    var the_value = $per.find('input:radio:checked').next("span").html();
                    $txar.val(the_value);
                    $(this).dialog( 'close' );
                },
                "Закрити": function() {$(this).dialog("close");}
            },
            position: {
                my: "top",
                at: "top",
                of: $("body"),
                within: $("body")
            }
        });
    });
}

