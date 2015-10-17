'use strict';

angular.module('productos.controllers',['productos.services'])
	.controller('prodControler', function($scope, API){
		$scope.id = "";
		API.obtenerProductos($scope.id).success(function(data){
			console.log(data);
			$scope.productos = data;
		});
		//lo llama cada que hay cambios
		$scope.update = function(){
			API.obtenerProductos($scope.id).success(function(data){
			console.log(data);
			$scope.productos = data;
		});
		}
	});