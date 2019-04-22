$package('sc.siteInformation');
sc.siteInformation = function(){
	var _box = null;
	var _this = {
		config:{
			dataGrid:{
				title:'Site Information',
				url:'dataList.do',
				columns:[[
					{field:'id',checkbox:true},
					{field:'name',title:'Name',width:120,sortable:true},
					{field:'city',title:'City',width:120,sortable:true},
					{field:'mobile',title:'Mobile',width:120,sortable:true},
					{field:'email',title:'Email',width:120,sortable:true},
					{field:'know',title:'Know',width:120,sortable:true},
					{field:'inform',title:'Inform',width:120,sortable:true},
					{field:'state',title:'State',width:80,sortable:true,styler:function(value,row,index){
						if(value == 0){
							return 'color:red;';
						}
					},
					formatter:function(value,row,index){
						if(value == 0){
							return "未读";
						}else if(value == 1){
							return "解决";
						}else if(value ==2){
							return "审核";
						}
					}}
				]]
			}
		},
		init:function(){
			_box = new YDataGrid(_this.config);
			_box.init();
		}
	}
	return _this;
}();

$(function(){
	sc.siteInformation.init();
})















