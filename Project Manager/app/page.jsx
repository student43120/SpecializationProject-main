export default function Home() {
  return (
    <div className="bg-gray-100 min-h-screen">
      <div className="container mx-auto py-12">
        <div className="text-center">
          <h1 className="text-5xl font-bold text-black mb-4">
            My First Task Management Project
          </h1>
          <p className="text-lg text-gray-600 mb-8">
            Welcome to my first task management application built with Next.js. Start organizing your tasks now!
          </p>
        </div>

        <div className="mb-12">
          <h2 className="text-3xl font-semibold text-black mb-4">Highlighted Features</h2>
          <ul className="list-disc list-inside text-lg text-gray-700">
            <li>Intuitive user interface</li>
            <li>Organize your tasks into projects</li>
            <li>Organize your tasks into lists</li>
          </ul>
        </div>

        <div className="mb-12">
          <h2 className="text-3xl font-semibold text-black mb-4">What Our Users Say</h2>
          <div className="bg-white p-6 rounded-lg shadow-md text-center">
            <blockquote className="italic text-gray-700">
              "This app has transformed the way I manage my daily tasks! Very impressed."
            </blockquote>
            <cite className="mt-2 block text-indigo-700">- Elon Musk</cite>
          </div>
          <div className="bg-white p-6 rounded-lg shadow-md text-center mt-8">
            <blockquote className="italic text-gray-700 mt-4">
              "I no longer have to worry about forgetting important tasks! Thank you!"
            </blockquote>
            <cite className="mt-2 block text-indigo-700">- Jeff Bezos</cite>
          </div>
        </div>

        <div className="mb-12">
          <h2 className="text-3xl font-semibold text-black mb-4">Getting Started</h2>
          <ol className="list-decimal list-inside text-lg text-gray-700">
            <li>Access projects</li>
            <li>Create your first project</li>
            <li>Create your first task list</li>
            <li>Add tasks to the list and start organizing</li>
          </ol>
        </div>

        <div className="mb-12">
          <h2 className="text-3xl font-semibold text-black mb-4">Latest Updates</h2>
          <p className="text-lg text-gray-700">Check out our latest improvements, you'll love them!</p>
          <ul className="list-disc list-inside text-lg text-gray-700">
            <li>Performance improvements</li>
            <li>User interface enhancements</li>
          </ul>
        </div>
      </div>
    </div>
  );
}
