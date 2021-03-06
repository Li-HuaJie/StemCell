$package('sc.login');
sc.login = function(){
	return {
		toLogin:function(){
			try{
				var form = $("#loginForm");
				if(form.form('validate')){
					sc.progress('Please waiting','Loading...');
					sc.submitForm(form,function(data){
						sc.closeProgress();
						sc.login.loadVrifyCode();//刷新验证码
						if(data.success){
					 		window.location= "main.shtml";
				        }else{
				       	   sc.alert('提示',data.msg,'error');  
				        }
					});
				}
			}catch(e){
				
			}
			return false;
		},
		loadVrifyCode:function(){//刷新验证码
			var _url = "ImageServlet?time="+new Date().getTime();
			$(".vc-pic").attr('src',_url);
		},
		init:function(){
			if(window.top != window.self){
				window.top.location =  window.self.location;
			}
			//验证码图片绑定点击事件
			$(".vc-pic").click(sc.login.loadVrifyCode);
			
			var form = $("#loginForm");
			form.submit(sc.login.toLogin);
		}
	}
}();

$(function(){
	sc.login.init();
});		