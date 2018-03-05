$(function(){
    cargarTabla();

    $("#btnGuardarUsuario").click(function(){
        const usuario = {
            "nombre": $("#nombre").val(),
            "apellidos": $("#apellidos").val(),
            "direccion": $("#direccion").val(),
            "telefono": $("#telefono").val()
        };
        
        $.ajax({
            url:"http://localhost:8080/taller/webapi/clientes",
            method: "POST",
            contentType: "json",
            crossDomain: true,
            dataType: "json",
            data: usuario.toJSON(),
        }).done(function(){
            cargarTabla();
        });
    });
});

let cargarTabla = function(){
    let $tblBody = $("#tblBody");
    $.getJSON("http://localhost:8080/taller/webapi/clientes")
        .done(function(usuarios){
            //console.log(usuarios);
            $.each(usuarios, function(i, usuario){
                let $tr = $("<tr/>");

                $tr.append($("<td>",{
                    text: usuario.nombre
                }));

                $tr.append($("<td>",{
                    text: usuario.apellidos
                }));

                $tr.append($("<td>",{
                    text: usuario.direccion
                }));

                $tr.append($("<td>",{
                    text: usuario.telefono
                }));

                $tblBody.append($tr);
            })

        })
        .fail(function(jqxhr, textStatus, error){
            console.log(error);
        });
}