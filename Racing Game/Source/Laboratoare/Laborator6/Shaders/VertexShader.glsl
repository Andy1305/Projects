#version 330


layout(location = 0) in vec3 v_position;


// Uniform properties
uniform mat4 Model;
uniform mat4 View;
uniform mat4 Projection;

uniform vec3 object_color;
uniform float time;

out vec3 color;

void main()
{
	int speed = 3;

	// Interpoleaza culorile, conform timpului zilei.
	color = mix(object_color, vec3(0, 0, 0), time / speed);
	
	gl_Position = Projection * View * Model * vec4(v_position, 1.0);
}
