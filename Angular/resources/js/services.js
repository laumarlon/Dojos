'use strict';

angular.module('productos.services',[])
	.factory('API', function($http){
		var base = 'https://spinnerbank-api-external.herokuapp.com';
		return{
			obtenerProductos : function(id){
				return $http.get(base + '/productos/' + id,{
					method : 'GET'
				});
			}
		};
	});