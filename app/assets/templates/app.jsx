'use strict';

var App = React.createClass({
	render: function(){
		return (
			<div>{this.getHelloMessage()}</div>
		);
	},
	getHelloMessage : function(){
		return "Hello World !";
	}
});

React.render(<App />, document.getElementById('wrapper'));