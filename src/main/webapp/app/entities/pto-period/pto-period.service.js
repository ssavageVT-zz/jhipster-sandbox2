(function() {
    'use strict';
    angular
        .module('ptotrackerApp')
        .factory('PtoPeriod', PtoPeriod);

    PtoPeriod.$inject = ['$resource', 'DateUtils'];

    function PtoPeriod ($resource, DateUtils) {
        var resourceUrl =  'api/pto-periods/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                        data.endDate = DateUtils.convertDateTimeFromServer(data.endDate);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
