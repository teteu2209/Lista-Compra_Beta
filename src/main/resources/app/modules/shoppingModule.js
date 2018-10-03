var shoppingModule = angular.module('ShoppingModule', []);

shoppingModule.factory('Products', function() {
  var products = {};

  products.query = function() {
    return [
      { name: 'Teclado', price: ' 22', qty: null },
      { name: 'Mouse', price: ' 32', qty: null },
      { name: 'SSD', price: ' 42', qty: null },
      { name: 'Gabinete', price: ' 52', qty: null }
    ];
  }


  return products;
});
