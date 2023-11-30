import Link from "next/link";

export function ProjectCard({ project, onDelete }) {
  return (
    <div className="bg-white p-4 rounded-lg shadow-md flex items-center justify-between">
      <Link
        href={`/projects/${project.id}`}
        className="mr-2 text-blue-500 hover:underline"
      >
        {project.name}
      </Link>
      <button
        onClick={() => onDelete(project.id)}
        className="text-red-500 hover:text-red-700"
      >
        Eliminar
      </button>
    </div>
  );
}
