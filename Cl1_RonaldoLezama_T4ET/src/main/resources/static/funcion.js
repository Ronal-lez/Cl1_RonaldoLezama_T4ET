function eliminar(id) {
	swal({
		title: "Estas seguro?",
		text: "Una vez que elimines no se podra restaurar el registro eliminado",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminar/" + id,
					success :function(res) {
						console.log(res);
					}
				});
				swal("Se a eliminado correctamente el registro", {
					icon: "success",
				}).then((ok)=>{
					if(ok){
						location.href="/listar";
					}
				});
			} else {
				swal("Registro a salvo");
			}
		});
}